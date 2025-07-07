package com.nautilus

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_card)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /***/
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
        /**-----------*/

        val txtCardTitle = findViewById<TextView>(R.id.txtCardTitle)
        val txtCardDes = findViewById<TextView>(R.id.txtCardDes)
        val imgCardNum = findViewById<ImageView>(R.id.imgCardNum)
        val imgCard = findViewById<ImageView>(R.id.imgCard)

        /**
         * Recuperate the "btnNum" from the previous activity (MainMenu.kt)
         *     to use it as which button is pressed
         */
        val memo=intent.extras
        val btnClicked = memo?.getString("btnNum")

        /**
         * Depending on which button is clicked (previously in MainMenu.kt), the card will change
         * with correct information.
         */
        when (btnClicked) {
            "btn1" -> {
                txtCardTitle.text = getString(R.string.cardTitle1)
                txtCardDes.text = getString(R.string.cardDescription1)
                imgCardNum.setImageResource(R.drawable.numero1)
                imgCard.setImageResource(R.drawable.img1__introduccion)
            }
            "btn2" -> {
                txtCardTitle.text = getString(R.string.cardTitle2)
                txtCardDes.text = getString(R.string.cardDescription2)
                imgCardNum.setImageResource(R.drawable.numero2)
                imgCard.setImageResource(R.drawable.img2__acantilados)
            }
            "btn3" -> {
                txtCardTitle.text = getString(R.string.cardTitle3)
                txtCardDes.text = getString(R.string.cardDescription3)
                imgCardNum.setImageResource(R.drawable.numero3)
                imgCard.setImageResource(R.drawable.img3__cala_pedrosa)
            }
            "btn4" -> {
                txtCardTitle.text = getString(R.string.cardTitle4)
                txtCardDes.text = getString(R.string.cardDescription4)
                imgCardNum.setImageResource(R.drawable.numero4)
                imgCard.setImageResource(R.drawable.img4__foradada)
            }
            "btn5" -> {
                txtCardTitle.text = getString(R.string.cardTitle5)
                txtCardDes.text = getString(R.string.cardDescription5)
                imgCardNum.setImageResource(R.drawable.numero5)
                imgCard.setImageResource(R.drawable.img5__tres_coves)
            }
            "btn6" -> {
                txtCardTitle.text = getString(R.string.cardTitle6)
                txtCardDes.text = getString(R.string.cardDescription6)
                imgCardNum.setImageResource(R.drawable.numero6)
                imgCard.setImageResource(R.drawable.img6__montgo_)
            }
            "btn7" -> {
                txtCardTitle.text = getString(R.string.cardTitle7)
                txtCardDes.text = getString(R.string.cardDescription7)
                imgCardNum.setImageResource(R.drawable.numero7)
                imgCard.setImageResource(R.drawable.img7_l_escala_)
            }
            "btn8" -> {
                txtCardTitle.text = getString(R.string.cardTitle8)
                txtCardDes.text = getString(R.string.cardDescription8)
                imgCardNum.setImageResource(R.drawable.numero8)
                imgCard.setImageResource(R.drawable.img8__empuries_2)
            }
            "btn9" -> {
                txtCardTitle.text = getString(R.string.cardTitle9)
                txtCardDes.text = getString(R.string.cardDescription9)
                imgCardNum.setImageResource(R.drawable.numero9)
                imgCard.setImageResource(R.drawable.img9__medes_emergides_2)
            }
            "btn10" -> {
                txtCardTitle.text = getString(R.string.cardTitle10)
                txtCardDes.text = getString(R.string.cardDescription10)
                imgCardNum.setImageResource(R.drawable.numero10)
                imgCard.setImageResource(R.drawable.img10_medes_sumergidas)
            }
            "btn11" -> {
                txtCardTitle.text = getString(R.string.cardTitle11)
                txtCardDes.text = getString(R.string.cardDescription11)
                imgCardNum.setImageResource(R.drawable.numero11)
                imgCard.setImageResource(R.drawable.img11_cierre)
            }
        }
    }
}