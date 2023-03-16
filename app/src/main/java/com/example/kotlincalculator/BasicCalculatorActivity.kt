package com.example.kotlincalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincalculator.calculatorlogic.Calculator
import com.example.kotlincalculator.databinding.ActivityBasicCalculatorBinding

class BasicCalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBasicCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var calculations = ""
        val key = "KEFTEME_CALCULATOR"
        val calculator: Calculator?
        calculator = Calculator
        with(binding) {
            tvResult.text = ""
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
                tvResult.text = calculations
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                            calculations.length - 1
                        ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                            calculations.length - 1
                        ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                            calculations.length - 1
                        ) != "√" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                            calculations.length - 1
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                            calculations.length - 1
                        ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                            calculations.length - 1
                        ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                            calculations.length - 1
                        ) != "√" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                            calculations.length - 1
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                            calculations.length - 1
                        ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                            calculations.length - 1
                        ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                            calculations.length - 1
                        ) != "√" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                            calculations.length - 1
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                            calculations.length - 1
                        ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                            calculations.length - 1
                        ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                            calculations.length - 1
                        ) != "√" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                            calculations.length - 1
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                            calculations.length - 1
                        ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                            calculations.length - 1
                        ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                            calculations.length - 1
                        ) != "√" && calculations.substring(calculations.length - 1) != "!" && calculations.substring(
                            calculations.length - 1
                        ) != "n" && calculations.substring(calculations.length - 1) != "s"
                    ) {
                        var havePoint = false
                        for (i in calculations.length - 1 downTo 0) {
                            if (calculations[i] == '.') {
                                havePoint = true
                                break
                            } else if (calculations[i] == ' ') {
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                            calculations.length - 1
                        ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                            calculations.length - 1
                        ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                            calculations.length - 1
                        ) != "√" && calculations.substring(calculations.length - 1) != "!" && calculations.substring(
                            calculations.length - 1
                        ) != "n" && calculations.substring(calculations.length - 1) != "s"
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
                    calculations = calculations.substring(0, calculations.length - 1)
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
                    if (calculations.substring(calculations.length - 1) != " " && calculations.substring(
                            calculations.length - 1
                        ) != "."
                    ) {
                        calculations =
                            calculator.calculatorHandleLine(calculations)
                                .replace("\\.?0*$".toRegex(), "")
                        tvResult.text = calculations
                    }
                } catch (s: IndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonOpenCalculatorPro.setOnClickListener {
                val intent =
                    Intent(this@BasicCalculatorActivity, EngineeringCalculatorActivity::class.java)
                Intent()
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