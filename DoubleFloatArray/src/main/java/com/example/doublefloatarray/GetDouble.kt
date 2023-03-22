package com.example.doublefloatarray

import android.content.Context
import android.util.Log

private const val TAG = "GetDouble"
class GetDouble {

    companion object{

        init {
            System.loadLibrary("nativelibrary")
        }

        fun simpleNativeLib(context: Context, floatArr: FloatArray) : FloatArray{
            Log.d(TAG, "simpleNativeLib: ")
            Log.d(TAG, "simpleNativeLib: sample")
            return floatFromJNI(floatArr)
        }

        private external fun floatFromJNI(floatArr: FloatArray): FloatArray
    }

}