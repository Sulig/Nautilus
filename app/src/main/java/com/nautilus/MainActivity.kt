package com.nautilus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEntry = findViewById<Button>(R.id.btnEntry)
        val btnExit = findViewById<Button>(R.id.btnExit)

        // --
        btnEntry.setOnClickListener {
           val actMenu = Intent(this, MainMenu::class.java)
            startActivity(actMenu)
        }
        btnExit.setOnClickListener {
            finish()
        }
        //-***************-

        /** Coroutine -->*/
        CoroutineScope(Dispatchers.Main).launch {
            // Wait 3 seconds
            delay(TimeUnit.SECONDS.toMillis(3))
            withContext(Dispatchers.Main) {
                // Start the MainMenu activity
                val actMenu = Intent(this@MainActivity, MainMenu::class.java)
                startActivity(actMenu)
            }
        }
        /***************************************/
    }
}