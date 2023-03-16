package com.example.kotlincalculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincalculator.calculatorlogic.Calculator
import com.example.kotlincalculator.databinding.ActivityBasicCalculatorBinding

class BasicCalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBasicCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var calculations: String?
        val key = "KEFTEME_CALCULATOR"
        var calculator: Calculator?
        calculator = Calculator
            setContentView(R.layout.activity_basic_calculator)
            val buttonNumberOne = findViewById<Button>(R.id.buttonNumberOne)
            val buttonNumberTwo = findViewById<Button>(R.id.buttonNumberTwo)
            val buttonNumberThree = findViewById<Button>(R.id.buttonNumberThree)
            val buttonNumberFour = findViewById<Button>(R.id.buttonNumberFour)
            val buttonNumberFive = findViewById<Button>(R.id.buttonNumberFive)
            val buttonNumberSix = findViewById<Button>(R.id.buttonNumberSix)
            val buttonNumberSeven = findViewById<Button>(R.id.buttonNumberSeven)
            val buttonNumberEight = findViewById<Button>(R.id.buttonNumberEight)
            val buttonNumberNine = findViewById<Button>(R.id.buttonNumberNine)
            val buttonNumberZero = findViewById<Button>(R.id.buttonNumberZero)
            val buttonPlus = findViewById<Button>(R.id.buttonPlus)
            val buttonMinus = findViewById<Button>(R.id.buttonMinus)
            val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
            val buttonDivide = findViewById<Button>(R.id.buttonDivide)
            val buttonEquals = findViewById<Button>(R.id.buttonEquals)
            val buttonPoint = findViewById<Button>(R.id.buttonPoint)
            val buttonOpenCalculatorPro = findViewById<Button>(R.id.buttonOpenCalculatorPro)
            val buttonPercent = findViewById<Button>(R.id.buttonPercent)
            val buttonClear = findViewById<Button>(R.id.buttonClear)
            val buttonClearAll = findViewById<Button>(R.id.buttonClearAll)
            tvResult = findViewById(R.id.tvResult)
        binding.tvResult.text = ""
            calculations = ""
            buttonNumberOne.setOnClickListener {
                calculations += "1"
                tvResult.text = calculations
            }
            buttonNumberTwo.setOnClickListener {
                calculations += "2"
                tvResult.text = calculations
            }
            buttonNumberThree.setOnClickListener {
                calculations += "3"
                tvResult.text = calculations
            }
            buttonNumberFour.setOnClickListener {
                calculations += "4"
                tvResult.text =calculations
            }
            buttonNumberFive.setOnClickListener {
                calculations += "5"
                tvResult.text = calculations
            }
            buttonNumberSix.setOnClickListener {
                calculations += "6"
                tvResult.text = calculations
            }
            buttonNumberSeven.setOnClickListener {
                calculations += "7"
                tvResult.text = calculations
            }
            buttonNumberEight.setOnClickListener {
                calculations += "8"
                tvResult.text = calculations
            }
            buttonNumberNine.setOnClickListener {
                calculations += "9"
                tvResult.text = calculations
            }
            buttonNumberZero.setOnClickListener {
                calculations += "0"
                tvResult.text = calculations
            }
            buttonPlus.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "." && calculations!!.substring(calculations!!.length - 1) != "+" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "-" && calculations!!.substring(calculations!!.length - 1) != "*" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "/" && calculations!!.substring(calculations!!.length - 1) != "^" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "√" && calculations!!.substring(calculations!!.length - 1) != "n" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "s"
                    ) {
                        calculations += " + "
                        tvResult.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonMinus.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "." && calculations!!.substring(calculations!!.length - 1) != "+" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "-" && calculations!!.substring(calculations!!.length - 1) != "*" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "/" && calculations!!.substring(calculations!!.length - 1) != "^" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "√" && calculations!!.substring(calculations!!.length - 1) != "n" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "s"
                    ) {
                        calculations += " - "
                        tvResult.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonMultiply.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "." && calculations!!.substring(calculations!!.length - 1) != "+" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "-" && calculations!!.substring(calculations!!.length - 1) != "*" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "/" && calculations!!.substring(calculations!!.length - 1) != "^" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "√" && calculations!!.substring(calculations!!.length - 1) != "n" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "s"
                    ) {
                        calculations += " * "
                        tvResult.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonDivide.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "." && calculations!!.substring(calculations!!.length - 1) != "+" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "-" && calculations!!.substring(calculations!!.length - 1) != "*" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "/" && calculations!!.substring(calculations!!.length - 1) != "^" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "√" && calculations!!.substring(calculations!!.length - 1) != "n" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "s"
                    ) {
                        calculations += " / "
                        tvResult.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonPoint.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "." && calculations!!.substring(calculations!!.length - 1) != "+" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "-" && calculations!!.substring(calculations!!.length - 1) != "*" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "/" && calculations!!.substring(calculations!!.length - 1) != "^" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "√" && calculations!!.substring(calculations!!.length - 1) != "!" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "n" && calculations!!.substring(calculations!!.length - 1) != "s"
                    ) {
                        var havePoint = false
                        for (i in calculations!!.length - 1 downTo 0) {
                            if (calculations!![i] == '.') {
                                havePoint = true
                                break
                            } else if (calculations!![i] == ' ') {
                                break
                            }
                        }
                        if (!havePoint) {
                            calculations += "."
                            tvResult.text = calculations
                        }
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonPercent.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "." && calculations!!.substring(calculations!!.length - 1) != "+" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "-" && calculations!!.substring(calculations!!.length - 1) != "*" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "/" && calculations!!.substring(calculations!!.length - 1) != "^" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "√" && calculations!!.substring(calculations!!.length - 1) != "!" && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "n" && calculations!!.substring(calculations!!.length - 1) != "s"
                    ) {
                        calculations += " %"
                        tvResult.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonClear.setOnClickListener {
                try {
                    calculations = calculations!!.substring(0, calculations!!.length - 1)
                    tvResult.text = calculations
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonClearAll.setOnClickListener {
                calculations = ""
                tvResult.text = calculations
            }
            buttonEquals.setOnClickListener {
                try {
                    if (calculations!!.substring(calculations!!.length - 1) != " " && calculations!!.substring(
                            calculations!!.length - 1
                        ) != "."
                    ) {
                        calculations =
                            java.lang.String.valueOf(calculator.calculatorHandleLine(calculations))
                                .replace("\\.?0*$".toRegex(), "")
                        tvResult.text = calculations
                    }
                } catch (s: IndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonOpenCalculatorPro.setOnClickListener { view: View? ->
                val intent = Intent(this, EngineeringCalculator::class.java)
                intent.putExtra(key, calculations)
                startActivity(intent)
                finish()
            }
            val ecCalculations = intent.getStringExtra(key)
            if (ecCalculations != null) calculations = ecCalculations
        tvResult.text = calculations
        }
    }
    }
}