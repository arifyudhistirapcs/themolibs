package com.example.themo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.themolibs.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnToast)
        val msg = "sekia"
        val bundle = Bundle()

        btn.setOnClickListener {
            bundle.putString("msg",msg)
            Utils(this,bundle, object : Utils.onResponseUtil{
                override fun onProgress() {
                    TODO("Not yet implemented")
                }

                override fun onSuccess() {
                    Log.e("s","s")
                }

                override fun onError() {
                    TODO("Not yet implemented")
                }

            })
        }


    }
}