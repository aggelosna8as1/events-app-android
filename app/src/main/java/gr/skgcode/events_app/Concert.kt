package gr.skgcode.events_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Concert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concert)
        var backButton1 = findViewById<Button>(R.id.backButton1)
        backButton1.setOnClickListener {
            finish()
        }
    }
}