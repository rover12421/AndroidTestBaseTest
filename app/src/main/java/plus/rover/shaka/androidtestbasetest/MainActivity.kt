package plus.rover.shaka.androidtestbasetest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val info = findViewById<TextView>(R.id.info)
        try {
            val loadClass = classLoader.loadClass("junit.framework.Assert")
            info.text = "loadClass(Assert) : $loadClass"
        } catch (e: Throwable) {
            info.text = "loadClass(Assert) Throwable : ${e.localizedMessage}"
        }
    }
}