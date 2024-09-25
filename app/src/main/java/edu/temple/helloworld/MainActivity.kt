package edu.temple.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayTextView: TextView = findViewById(R.id.displayTextView)
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val clickMeButton: Button = findViewById(R.id.clickMeButton)

        clickMeButton.setOnClickListener {
            val name = nameEditText.text.toString()
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                displayTextView.text = "Hello, $name!"
            }
        }
    }
}