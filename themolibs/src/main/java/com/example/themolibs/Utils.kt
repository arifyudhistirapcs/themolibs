package com.example.themolibs

import android.content.Context
import android.widget.Toast

class Utils {


    fun themoToast(context: Context, msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }


}