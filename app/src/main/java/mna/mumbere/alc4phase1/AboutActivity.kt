package mna.mumbere.alc4phase1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.loadUrl("https://andela.com/alc/")
    }
}
