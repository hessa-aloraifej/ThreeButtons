package com.example.threebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var text=findViewById<TextView>(R.id.textView4)
        val names= intent.extras?.getString("name")

        val phone= intent.extras?.getInt("phone")
        val location=intent.extras?.getString("location")
        text.text= "The Name Is: $names\nThe Phone Number Is : $phone\nThe location Is : $location\n"
    }
}


