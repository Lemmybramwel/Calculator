package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        Btn_add.setOnClickListener {
            var firstnum = Edt_FNum.text.toString()
            var secondnum = Edt_snum.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {

                txt_answer.text = "Please fill in the details"
            } else {
                var answer = firstnum.toDouble() + secondnum.toDouble()
                txt_answer.text = answer.toString()
            }

        }
        Btn_sub.setOnClickListener {
            var firstnum = Edt_FNum.text.toString()
            var secondnum = Edt_snum.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {

                txt_answer.text = "Please fill in the details"
            } else {
                var answer = firstnum.toDouble() - secondnum.toDouble()
                txt_answer.text = answer.toString()
            }

        }
        Btn_multiply.setOnClickListener {
            var firstnum = Edt_FNum.text.toString()
            var secondnum = Edt_snum.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {

                txt_answer.text = "Please fill in the details"
            } else {
                var answer = firstnum.toDouble() * secondnum.toDouble()
                txt_answer.text = answer.toString()
            }

        }
        Btn_divide.setOnClickListener {
            var firstnum = Edt_FNum.text.toString()
            var secondnum = Edt_snum.text.toString()

            if (firstnum.isEmpty() or secondnum.isEmpty()) {

                txt_answer.text = "Please fill in the details"
            } else {
                var answer = firstnum.toDouble() / secondnum.toDouble()
                txt_answer.text = answer.toString()
            }

        }
    }
}