package com.sws.squareequationsolving

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sws.squareequationsolving.databinding.ActivityMainBinding
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var a = 0.0
        var b = 0.0
        var c = 0.0
        var d = 0.0

        binding.x1x2Solver.setOnClickListener {
            if (binding.aEdit.text.toString() != "") a = binding.aEdit.text.toString().toDouble()
            if (binding.bEdit.text.toString() != "") b = binding.bEdit.text.toString().toDouble()
            if (binding.cEdit.text.toString() != "") c = binding.cEdit.text.toString().toDouble()
            if ((b*b - 4* a*c) < 0) {
                binding.x1TextView.text = "D<0!!!"
                binding.x2TextView.text = "D<0!!!"
                binding.dTextView.text = "D<0!!!"
            }
            else {
                d = sqrt(b * b - 4 * a * c)
                binding.dTextView.text = "D=" + d.toString()
                binding.x1TextView.text = "x1=" + ((-b + d) / (2 * a)).toString()
                binding.x2TextView.text = "x2=" + ((-b - d) / (2 * a)).toString()
            }
        }

    }
}