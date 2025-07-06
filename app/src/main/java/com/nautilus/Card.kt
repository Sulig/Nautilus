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

        val memo=intent.extras
        val btnClicked = memo?.getString("btnNum")

        when (btnClicked) {
            "btn1" -> {
                txtCardTitle.setText("@string/cardTitle1")
                txtCardDes.setText("@string/cardDescription1")
                imgCardNum.setImageResource(R.drawable.numero1)
                imgCard.setImageResource(R.drawable.img1__introduccion)
            }
            "btn2" -> {
                txtCardTitle.text = "@string/cardTitle2"
                txtCardDes.text = "@string/cardDescription2"
                imgCardNum.setImageResource(R.drawable.numero2)
                imgCard.setImageResource(R.drawable.img2__acantilados)
            }
            "btn3" -> {
                txtCardTitle.text = "@string/cardTitle3"
                txtCardDes.text = "@string/cardDescription3"
                imgCardNum.setImageResource(R.drawable.numero3)
                imgCard.setImageResource(R.drawable.img3__cala_pedrosa)
            }
            "btn4" -> {
                txtCardTitle.text = "@string/cardTitle4"
                txtCardDes.text = "@string/cardDescription4"
                imgCardNum.setImageResource(R.drawable.numero4)
                imgCard.setImageResource(R.drawable.img4__foradada)
            }
            "btn5" -> {
                txtCardTitle.text = "@string/cardTitle5"
                txtCardDes.text = "@string/cardDescription5"
                imgCardNum.setImageResource(R.drawable.numero5)
                imgCard.setImageResource(R.drawable.img5__tres_coves)
            }
            "btn6" -> {
                txtCardTitle.text = "@string/cardTitle6"
                txtCardDes.text = "@string/cardDescription6"
                imgCardNum.setImageResource(R.drawable.numero6)
                imgCard.setImageResource(R.drawable.img6__montgo_)
            }
            "btn7" -> {
                txtCardTitle.text = "@string/cardTitle7"
                txtCardDes.text = "@string/cardDescription7"
                imgCardNum.setImageResource(R.drawable.numero7)
                imgCard.setImageResource(R.drawable.img7_l_escala_)
            }
            "btn8" -> {
                txtCardTitle.text = "@string/cardTitle8"
                txtCardDes.text = "@string/cardDescription8"
                imgCardNum.setImageResource(R.drawable.numero8)
                imgCard.setImageResource(R.drawable.img8__empuries_2)
            }
            "btn9" -> {
                txtCardTitle.text = "@string/cardTitle9"
                txtCardDes.text = "@string/cardDescription9"
                imgCardNum.setImageResource(R.drawable.numero9)
                imgCard.setImageResource(R.drawable.img9__medes_emergides_2)
            }
            "btn10" -> {
                txtCardTitle.text = "@string/cardTitle10"
                txtCardDes.text = "@string/cardDescription10"
                imgCardNum.setImageResource(R.drawable.numero10)
                imgCard.setImageResource(R.drawable.img10_medes_sumergidas)
            }
            "btn11" -> {
                txtCardTitle.text = "@string/cardTitle11"
                txtCardDes.text = "@string/cardDescription11"
                imgCardNum.setImageResource(R.drawable.numero11)
                imgCard.setImageResource(R.drawable.img11_cierre)
            }
        }
    }
}