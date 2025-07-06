package com.nautilus

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)

        btn1.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn1")
            startActivity(actCard)
        }
        btn2.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn2")
            startActivity(actCard)
        }
        btn3.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn3")
            startActivity(actCard)
        }
        btn4.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn4")
            startActivity(actCard)
        }
        btn5.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn5")
            startActivity(actCard)
        }
        btn6.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn6")
            startActivity(actCard)
        }
        btn7.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn7")
            startActivity(actCard)
        }
        btn8.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn8")
            startActivity(actCard)
        }
        btn9.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn9")
            startActivity(actCard)
        }
        btn10.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn10")
            startActivity(actCard)
        }
        btn11.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn11")
            startActivity(actCard)
        }
    }
}