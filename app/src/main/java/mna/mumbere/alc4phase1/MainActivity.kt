package mna.mumbere.alc4phase1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbout.setOnClickListener{
            val aboutIntent = Intent(this, AboutActivity::class.java)
             startActivity(aboutIntent)
        }

        btnProfile.setOnClickListener {
            val profileIntent = Intent(this, InfoActivity::class.java)
            startActivity(profileIntent)
        }
    }
}
