package com.juhnowski.ilya.testintentchooser

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun send(view: View){
        val message:EditText? = findViewById(R.id.editText)

        val intent:Intent = Intent(Intent.ACTION_SEND).apply {
            //https://www.freeformatter.com/mime-types-list.html
            setType("text/plain")
            putExtra(Intent.EXTRA_TEXT,message?.text)
        }


        val chosenIntent: Intent = Intent.createChooser(intent, "Send message via...")
        startActivity(chosenIntent)


    }
}
