package com.nautilus

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity() {
    /** Animation function **/
    private fun animate(target: ImageView, start: Float, end: Float, duration: Long, direction: String) {
        val animator = ObjectAnimator.ofFloat(target, direction, start, end)
        animator.duration = duration
        animator.repeatCount = ObjectAnimator.INFINITE
        animator.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //**************************************************/
        /** Buttons for custom descriptons **/
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
        val btnCredits = findViewById<Button>(R.id.btnCredits)
        //**************************************************/

        /** Btn Actions **/
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
        btnCredits.setOnClickListener {
            val actCard = Intent(this, Card::class.java)
            actCard.putExtra("btnNum", "btn")
            startActivity(actCard)
        }
        //**************************************************/

        /** Fishy images for animation **/
        val fish1 = findViewById<ImageView>(R.id.imgFish1)
        val fish2 = findViewById<ImageView>(R.id.imgFish2)
        val fish3 = findViewById<ImageView>(R.id.imgFish3)
        //**************************************************/

        /** Fishy animation **/
        val xStart = -3500
        val xEnd = 3500

        fish1.translationY = 888f
        fish2.translationY = 999f
        fish3.translationY = 555f
        fish1.scaleX = 1f
        fish2.scaleX = -1f

        animate(fish1, xStart.toFloat(), xEnd.toFloat(), 130000, "translationX")
        animate(fish2, xStart.toFloat(), xEnd.toFloat(), 10000, "translationX")
        animate(fish2, 999f, 1250f, 10000, "translationY")
        animate(fish3, xEnd.toFloat(), xStart.toFloat(), 8000, "translationX")

        //**************************************************/
    }
}