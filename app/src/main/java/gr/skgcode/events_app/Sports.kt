package gr.skgcode.events_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Sports : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)
        var backButton2 = findViewById<Button>(R.id.backButton2)
        backButton2.setOnClickListener {
            finish()
        }
        val imgpaokael = findViewById<ImageView>(R.id.imageView8)
        imgpaokael.setOnClickListener {
            val intent5 = Intent(this, PaokAel::class.java)
            startActivity(intent5)

        }
    }
}