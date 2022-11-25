package com.example.themo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.themolibs.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val utils = Utils()
        val btn = findViewById<Button>(R.id.btnToast)

        btn.setOnClickListener {
            utils.themoToast(this,"holaisekia")
        }


    }
}