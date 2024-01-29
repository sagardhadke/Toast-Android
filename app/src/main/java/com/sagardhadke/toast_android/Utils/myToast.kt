package com.sagardhadke.toast_android.Utils

import android.content.Context
import android.widget.TextView
import android.widget.Toast

class myToast {

    companion object {
        fun custToast(context: Context, text: String) {
            Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
        }
    }
}