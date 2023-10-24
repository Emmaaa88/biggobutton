package edu.uw.ischool.yc324.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var pushCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bigGoButton: Button = findViewById(R.id.bigGoButton)
        bigGoButton.setOnClickListener {
            pushCount++
            val newText = when(pushCount) {
                1 -> getString(R.string.you_have_pushed_me_singular, pushCount)
                else -> getString(R.string.you_have_pushed_me_plural, pushCount)
            }
            bigGoButton.text = newText
        }
    }
}
