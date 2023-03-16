package com.example.kotlincalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincalculator.calculatorlogic.Calculator
import com.example.kotlincalculator.databinding.ActivityEngineeringCalculatorBinding

class EngineeringCalculatorActivity : AppCompatActivity() {
    private val key = "KEFTEME_CALCULATOR"
    private lateinit var binding: ActivityEngineeringCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEngineeringCalculatorBinding.inflate(layoutInflater)
        val calculator: Calculator?
        calculator = Calculator
        var calculations: String
        setContentView(binding.root)
        with(binding) {
            tvResultEngineer.text = ""
            calculations = ""
            buttonNumberOneEngineer.setOnClickListener {
                calculations += "1"
                tvResultEngineer.text = calculations
            }
            buttonNumberTwoEngineer.setOnClickListener {
                calculations += "2"
                tvResultEngineer.text = calculations
            }
            buttonNumberThreeEngineer.setOnClickListener {
                calculations += "3"
                tvResultEngineer.text = calculations
            }
            buttonNumberFourEngineer.setOnClickListener {
                calculations += "4"
                tvResultEngineer.text = calculations
            }
            buttonNumberFiveEngineer.setOnClickListener {
                calculations += "5"
                tvResultEngineer.text = calculations
            }
            buttonNumberSixEngineer.setOnClickListener {
                calculations += "6"
                tvResultEngineer.text = calculations
            }
            buttonNumberSevenEngineer.setOnClickListener {
                calculations += "7"
                tvResultEngineer.text = calculations
            }
            buttonNumberEightEngineer.setOnClickListener {
                calculations += "8"
                tvResultEngineer.text = calculations
            }
            buttonNumberNineEngineer.setOnClickListener {
                calculations += "9"
                tvResultEngineer.text = calculations
            }
            buttonNumberZeroEngineer.setOnClickListener {
                calculations += "0"
                tvResultEngineer.text = calculations
            }
            buttonPlusEngineer.setOnClickListener {
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
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonMinusEngineer.setOnClickListener {
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
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonMultiplyEngineer.setOnClickListener {
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
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonDivideEngineer.setOnClickListener {
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
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonPointEngineer.setOnClickListener {
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
                            tvResultEngineer.text = calculations
                        }
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonPercentEngineer.setOnClickListener {
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
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonClearEngineer.setOnClickListener {
                try {
                    calculations = calculations.substring(0, calculations.length - 1)
                    tvResultEngineer.text = calculations
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonClearAllEngineer.setOnClickListener {
                calculations = ""
                tvResultEngineer.text = calculations
            }
            buttonEqualsEngineer.setOnClickListener {
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
                        calculations =
                            calculator.calculatorHandleLine(calculations)
                                .replace("\\.?0*$".toRegex(), "")
                        when (calculations) {
                            "300" -> {
                                tvResultEngineer.text = "Синий трактор едет к нам"
                            }
                            "Infinity" -> {
                                tvResultEngineer.text = "У нас так не принято"
                            }
                            else -> tvResultEngineer.text = calculations
                        }
                    }
                } catch (s: IndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonOpenBasicCalculator.setOnClickListener {
                val intent =
                    Intent(this@EngineeringCalculatorActivity, BasicCalculatorActivity::class.java)
                intent.putExtra(key, calculations)
                startActivity(intent)
                finish()
            }
            val bcCalculations = intent.getStringExtra(key)
            if (bcCalculations != null) calculations = bcCalculations
            tvResultEngineer.text = calculations
            buttonDegree.setOnClickListener {
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
                        calculations += " ^ "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonRoot.setOnClickListener {
                try {
                    if (calculations == "" || !calculations.substring(calculations.length - 1)
                            .chars()
                            .allMatch { codePoint: Int ->
                                Character.isDigit(
                                    codePoint
                                )
                            } && calculations[calculations.length - 2] != '√' && calculations.substring(
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
                        calculations += "√ "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonFactorial.setOnClickListener {
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
                        calculations += " !"
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonSin.setOnClickListener {
                try {
                    if (calculations == "" || !calculations.chars()
                            .allMatch { codePoint: Int ->
                                Character.isDigit(
                                    codePoint
                                )
                            } && calculations.substring(calculations.length - 1) != "." && calculations.substring(
                            calculations.length - 1
                        ) != "+" && calculations.substring(calculations.length - 1) != "-" && calculations.substring(
                            calculations.length - 1
                        ) != "*" && calculations.substring(calculations.length - 1) != "/" && calculations.substring(
                            calculations.length - 1
                        ) != "^" && calculations.substring(calculations.length - 1) != "√" && calculations.substring(
                            calculations.length - 1
                        ) != "!" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                            calculations.length - 1
                        ) != "s"
                    ) {
                        calculations += "sin "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonCos.setOnClickListener {
                try {
                    if (calculations == "" || !calculations.chars()
                            .allMatch { codePoint: Int ->
                                Character.isDigit(
                                    codePoint
                                )
                            } && calculations.substring(calculations.length - 1) != "." && calculations.substring(
                            calculations.length - 1
                        ) != "+" && calculations.substring(calculations.length - 1) != "-" && calculations.substring(
                            calculations.length - 1
                        ) != "*" && calculations.substring(calculations.length - 1) != "/" && calculations.substring(
                            calculations.length - 1
                        ) != "^" && calculations.substring(calculations.length - 1) != "√" && calculations.substring(
                            calculations.length - 1
                        ) != "!" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                            calculations.length - 1
                        ) != "s"
                    ) {
                        calculations += "cos "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
        }
    }
}