package com.example.emicalculator_18030121079

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var txtAValue: TextView
    lateinit var txtRValue: TextView
    lateinit var txtYValue: TextView
    lateinit var seekBar1: SeekBar
    lateinit var seekBar2: SeekBar
    lateinit var seekBar3: SeekBar
    lateinit var calculate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtAValue = findViewById(R.id.txtAValue)
        txtRValue = findViewById(R.id.txtRValue)
        txtYValue = findViewById(R.id.txtYValue)
        seekBar1 = findViewById(R.id.seekBar1)
        seekBar2 = findViewById(R.id.seekBar2)
        seekBar3 = findViewById(R.id.seekBar3)
        calculate = findViewById(R.id.button)

        seekBar1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtAValue.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        seekBar2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtRValue.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        seekBar3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtYValue.text = p1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

    }

    fun emiCalculate(view: View){
        var p = (seekBar1.progress).toDouble()
        var r= (seekBar2.progress).toDouble()
        var n = (seekBar3.progress).toDouble()

        var pr = p*r
        var numerator = Math.pow(1+r, n)
        var denominator = numerator - 1

        var result = pr*(numerator/denominator)

        Toast.makeText(applicationContext,"EMI: $result",Toast.LENGTH_LONG).show()

    }
}