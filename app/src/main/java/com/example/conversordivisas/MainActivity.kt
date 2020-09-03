package com.example.conversordivisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.view.isEmpty
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayOf("USA Dólar", "Euro", "Canadá Dólar")
        val lista2 = arrayOf("Colombia peso")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        val adaptador2 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista2)
        spinner.adapter = adaptador1
        spinner2.adapter = adaptador2

        button.setOnClickListener {
            val inputText = textInputLayout.editText?.text.toString().toDoubleOrNull()
            val dolar = inputText?.times(3.768)
            val euro = inputText?.times(4.464)
            val canada = inputText?.times(2.865)
            
                if (spinner.selectedItem.toString() == "USA Dólar" && spinner2.selectedItem.toString() == "Colombia peso") {

                    textViewTres.text = dolar.toString()

                } else

                    if (spinner.selectedItem.toString() == "Euro" && spinner2.selectedItem.toString() == "Colombia peso") {

                        textViewTres.text = euro.toString()

                    } else

                        if (spinner.selectedItem.toString() == "Canadá Dólar" && spinner2.selectedItem.toString() == "Colombia peso") {

                            textViewTres.text = canada.toString()

                        }
            
            //Metodo para asignar error cuando el campo este vacio
            if (inputText != null){
                textInputLayout.error = ""

            } else {
         
                textInputLayout.error = "Error"
                textView.text = ""
            }


        }


            textInputLayout.editText?.doOnTextChanged { _, _, _, _ ->
                // Respond to input text change
            }


        }
    }
