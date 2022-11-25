package com.example.themolibs

import android.content.Context
import android.os.Bundle
import android.widget.Toast

class Utils (context: Context, bundle: Bundle, response:onResponseUtil) {
    val response : onResponseUtil
    val context : Context

    init {
        this.response = response
        this.context = context
        val msg = bundle.getString("msg")

        if (msg != null) {
            themoToast(msg)
        }
    }


    fun themoToast(msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        response.onSuccess()
    }


    interface onResponseUtil {
        fun onProgress()
        fun onSuccess()
        fun onError()
    }
}