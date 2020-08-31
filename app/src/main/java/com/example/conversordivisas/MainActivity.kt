package com.example.conversordivisas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get input text
        val inputText = textInputLayout.editText?.text.toString()

        textInputLayout.editText?.doOnTextChanged { inputText, _, _, _ ->
            // Respond to input text change
        }


    }
}