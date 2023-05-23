package gr.skgcode.events_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgconcerts = findViewById<ImageView>(R.id.concertsIV)
        imgconcerts.setOnClickListener {
            val intent1 = Intent(this, Concert::class.java)
            startActivity(intent1)
        }
        val imgsports = findViewById<ImageView>(R.id.sportsIV)
        imgsports.setOnClickListener {
            val intent2 = Intent(this, Sports::class.java)
            startActivity(intent2)
        }
        val imgexhibitions = findViewById<ImageView>(R.id.exhibitionIV)
        imgexhibitions.setOnClickListener {
            val intent3 = Intent(this, Exhibitions::class.java)
            startActivity(intent3)
        }
        val imgtheaters = findViewById<ImageView>(R.id.theatersIV)
        imgtheaters.setOnClickListener {
            val intent4 = Intent(this, Theaters::class.java)
            startActivity(intent4)
        }

    }
}