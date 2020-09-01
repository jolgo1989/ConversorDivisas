package com.example.conversordivisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayOf("USA Dólar", "Euro", "Colombia peso", "Canadá Dólar")
        val lista2 = arrayOf("USA Dólar", "Euro", "Colombia peso", "Canadá Dólar")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        val adaptador2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista2)
        spinner.adapter = adaptador1
        spinner2.adapter = adaptador2

        button.setOnClickListener {
            // Get input text
            val inputText = textInputLayout.editText?.text.toString().toDouble()

            val dolar = 3.768
            val euro = 4.464
            val canada = 2.865
            val pesoCol = 0.0003

            when (spinner.selectedItem.toString()) {
                "USA Dólar" -> textViewTres.text = ("$dolar")
                "Euro" -> textViewTres.text = ("$euro")
                "Colombia peso" -> textViewTres.text = ("$pesoCol")
                "Canadá Dólar" -> textViewTres.text = ("$canada")

            }


            when (spinner2.selectedItem.toString()) {
                "USA Dólar" -> textViewCuatro.text = ("$dolar")
                "Euro" -> textViewCuatro.text = ("$euro")
                "Colombia peso" -> textViewCuatro.text = ("$pesoCol")
                "Canadá Dólar" -> textViewCuatro.text = ("$canada")

            }


        }







        textInputLayout.editText?.doOnTextChanged { inputText, _, _, _ ->
            // Respond to input text change
        }


    }
}