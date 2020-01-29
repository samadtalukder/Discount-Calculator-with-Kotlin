package com.samad_talukder.discountcalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalculate.setOnClickListener {
            calculateDiscount()
        }

    }

    @SuppressLint("SetTextI18n")
    private fun calculateDiscount() {
        if (etPrice.text.toString().isNotEmpty() && etDiscount.text.toString().isNotEmpty()) {

            val price: Double = etPrice.text.toString().toDouble()
            val discount: Double = etDiscount.text.toString().toDouble()

            val save = (price * discount / 100)
            val total = price - save

            tvSave.text = "$save $"

            tvPayAmount.text = "$total $"

        } else {
            Toast.makeText(this, "Give Price & Discount Amount Must Be ", Toast.LENGTH_SHORT).show()
        }
    }
}