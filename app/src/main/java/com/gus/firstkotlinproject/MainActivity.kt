package com.gus.firstkotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener({
            val inputName = nameText.text
            PreviewName.text = ("Hallo $inputName Thanks For Test My App!")
        })
    }
}
