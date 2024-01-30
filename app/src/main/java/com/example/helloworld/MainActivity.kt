package com.example.helloworld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var helloButton: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloButton = findViewById(R.id.hello_button)
        textView = findViewById(R.id.default_text)

        helloButton.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.hello_button),
                Toast.LENGTH_SHORT
            ).show()

            textView.text = getString(R.string.hello_world)
        }
    }
}
