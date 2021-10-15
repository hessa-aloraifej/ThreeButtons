package com.example.threebuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var phone:EditText
    lateinit var location:EditText
    private var names:String=""
    private var locations:String=""
    private var phones:Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         name=findViewById<EditText>(R.id.name)
         phone=findViewById<EditText>(R.id.phone)
         location=findViewById<EditText>(R.id.location)
        var textview=findViewById<TextView>(R.id.output)
        var toastbtn=findViewById<Button>(R.id.toastbtn)
        var textviewbtn=findViewById<Button>(R.id.textviewbtn)
        var newactivitybtn=findViewById<Button>(R.id.newactivitybtn)
        toastbtn.setOnClickListener {
            edittextfun()
            Toast.makeText(this,edittextfun() , Toast.LENGTH_SHORT).show()
        }
        textviewbtn.setOnClickListener {
            edittextfun()
            textview.text= edittextfun()

        }
        newactivitybtn.setOnClickListener {
            edittextfun()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name", names)
                       intent.putExtra("phone", phones)
                        intent.putExtra("location", locations)
            startActivity(intent)

        }
    }
    fun edittextfun():String{
        names =name.text.toString()
       phones =phone.text.toString().toInt()
       locations =location.text.toString()
        return "The Name Is : $names\n The Phone Number : $phones\n The Location : $locations\n"
    }

}