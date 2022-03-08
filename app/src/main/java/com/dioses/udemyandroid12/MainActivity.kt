package com.dioses.udemyandroid12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    var tts: TextToSpeech? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tts = TextToSpeech(this, this)
        findViewById<Button>(R.id.btn_play).setOnClickListener { speak() }
    }

    private fun speak() {
        var message: String = findViewById<TextView>(R.id.et_message).text.toString()
        if(message.isEmpty()){
            findViewById<TextView>(R.id.tv_status).text = "Introduzca un texto"
            message = "¿Es enserio? Ponga algo en el Edit text!"
        }
        tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            findViewById<TextView>(R.id.tv_status).text = "Hello kotlin!"
            tts!!.language = Locale("ES")
        } else {
            findViewById<TextView>(R.id.tv_status).text = "No disponible :("
        }
    }

    override fun onDestroy() {
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
}