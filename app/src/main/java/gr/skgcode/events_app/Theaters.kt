package gr.skgcode.events_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Theaters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theaters)
        var backButton3 = findViewById<Button>(R.id.backButton3)
        backButton3.setOnClickListener {
            finish()
        }
    }
}