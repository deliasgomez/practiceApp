package com.example.practiceapp

import android.graphics.Color
import android.widget.Button
import android.widget.EditText

class Utils {
    fun fullFieldsLogin(view1 : EditText, view2 : EditText,bottom : Button){
        if (view1.text?.length!! > 0 && view2.text?.length!! > 0 ){
            bottom.setBackgroundColor(Color.parseColor("#4B4747"))
        }else{
            bottom.setBackgroundColor(Color.parseColor("#9D9C9C"))
        }
    }
    fun fullFieldsregister(view1: EditText,view2: EditText,view3: EditText,bottom: Button){
        if (view1.text?.length!! > 0 && view2.text?.length!! > 0 && view3.text?.length!! > 0 ){
            bottom.setBackgroundColor(Color.parseColor("#4B4747"))
        }else{
            bottom.setBackgroundColor(Color.parseColor("#9D9C9C"))
        }
    }
}