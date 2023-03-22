package com.example.kotlincalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.checkPlusMinusMultiplyDivideEquals
import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.checkPointPercentDegreeFactorial
import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.checkRoot
import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.checkSinCos
import com.example.kotlincalculator.calculatorlogic.LineHandler
import com.example.kotlincalculator.databinding.ActivityEngineeringCalculatorBinding

class EngineeringCalculatorActivity : AppCompatActivity() {
    private val key = "KEFTEME_CALCULATOR"
    private lateinit var binding: ActivityEngineeringCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEngineeringCalculatorBinding.inflate(layoutInflater)
        val lineHandler = LineHandler()
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
                    if (checkPlusMinusMultiplyDivideEquals(calculations)) {
                        calculations += " + "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonMinusEngineer.setOnClickListener {
                try {
                    if (checkPlusMinusMultiplyDivideEquals(calculations)) {
                        calculations += " - "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonMultiplyEngineer.setOnClickListener {
                try {
                    if (checkPlusMinusMultiplyDivideEquals(calculations)) {
                        calculations += " * "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonDivideEngineer.setOnClickListener {
                try {
                    if (checkPlusMinusMultiplyDivideEquals(calculations)) {
                        calculations += " / "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonPointEngineer.setOnClickListener {
                try {
                    if (calculations.isEmpty()) {
                        calculations += "0."
                        tvResultEngineer.text = calculations
                    }
                    var haveNumber = false
                    for (i in calculations.length - 1 downTo 0) {
                        if (calculations[i].isDigit()) {
                            haveNumber = true
                            break
                        } else if (calculations[i] == ' ') {
                            break
                        }
                    }
                    if (!haveNumber) {
                        calculations += "0."
                        tvResultEngineer.text = calculations
                    }
                    if (checkPointPercentDegreeFactorial(calculations)) {
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
                    if (checkPointPercentDegreeFactorial(calculations)) {
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
                    if (checkPlusMinusMultiplyDivideEquals(calculations)) {
                        calculations = lineHandler.handleLine(calculations)
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
                    if (checkPointPercentDegreeFactorial(calculations)) {
                        calculations += " ^ "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonRoot.setOnClickListener {
                try {
                    if (checkRoot(calculations)) {
                        calculations += "√ "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonFactorial.setOnClickListener {
                try {
                    if (checkPointPercentDegreeFactorial(calculations)) {
                        calculations += " !"
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonSin.setOnClickListener {
                try {
                    if (checkSinCos(calculations)) {
                        calculations += "sin "
                        tvResultEngineer.text = calculations
                    }
                } catch (s: StringIndexOutOfBoundsException) {
                    println(s.message)
                }
            }
            buttonCos.setOnClickListener {
                try {
                    if (checkSinCos(calculations)) {
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