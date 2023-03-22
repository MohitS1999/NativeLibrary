package com.example.nativelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.doublefloatarray.GetDouble
import com.example.nativelibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var arr = floatArrayOf(5F,3f,4f,5f,5f)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sum_array =  GetDouble.simpleNativeLib(baseContext,arr)
        var x = ""
        for (item in sum_array){
            x += item.toString()+ " - "
        }
        binding.sampleText.text = x
    }
}