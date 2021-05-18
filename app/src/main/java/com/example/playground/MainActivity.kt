package com.example.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD
=======
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
>>>>>>> f8c0664 (alert button)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< HEAD
=======

        alertButton.setOnClickListener {
            Log.i("MainActivity", "am clicked")

            // using toast, method
            Toast.makeText(this, "Hi Mustapha", Toast.LENGTH_SHORT).show()
        }
>>>>>>> f8c0664 (alert button)
    }
}