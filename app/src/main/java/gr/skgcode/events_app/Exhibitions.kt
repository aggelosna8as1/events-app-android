package gr.skgcode.events_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Exhibitions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exhibitions)
        var backButton4 = findViewById<Button>(R.id.backButton4)
        backButton4.setOnClickListener {
            finish()
        }
    }
}