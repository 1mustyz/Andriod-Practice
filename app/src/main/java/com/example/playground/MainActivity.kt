package com.example.playground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alertButton.setOnClickListener {
            Log.i("MainActivity", "am clicked")

            // using toast, method
            Toast.makeText(this, "Hi Mustapha", Toast.LENGTH_SHORT).show()
        }

        btnNextActivity.setOnClickListener {
            val message: String = messageText.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

                // navigating to second activity

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)

            startActivity(intent)

        }

    }
}