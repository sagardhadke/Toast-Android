package com.sagardhadke.toast_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.sagardhadke.toast_android.Utils.myToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)

        textView.setOnClickListener {
            Toast.makeText(this, "Testing Default Toast", Toast.LENGTH_SHORT).show()

            myToast.custToast(this,"Sagar")
            
        }

    }
}