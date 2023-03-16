package com.example.kotlincalculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincalculator.calculatorlogic.Calculator

class EngineeringCalculatorActivity : AppCompatActivity() {
    private var calculations: String? = null
    private val key = "KEFTEME_CALCULATOR"
    private var tvResultEngineer: TextView? = null
    private var calculator: Calculator? = null
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain
        calculator = Calculator
        setContentView(R.layout.activity_engineering_calculator)
        val buttonNumberOneEngineer = findViewById<Button>(R.id.buttonNumberOneEngineer)
        val buttonNumberTwoEngineer = findViewById<Button>(R.id.buttonNumberTwoEngineer)
        val buttonNumberThreeEngineer = findViewById<Button>(R.id.buttonNumberThreeEngineer)
        val buttonNumberFourEngineer = findViewById<Button>(R.id.buttonNumberFourEngineer)
        val buttonNumberFiveEngineer = findViewById<Button>(R.id.buttonNumberFiveEngineer)
        val buttonNumberSixEngineer = findViewById<Button>(R.id.buttonNumberSixEngineer)
        val buttonNumberSevenEngineer = findViewById<Button>(R.id.buttonNumberSevenEngineer)
        val buttonNumberEightEngineer = findViewById<Button>(R.id.buttonNumberEightEngineer)
        val buttonNumberNineEngineer = findViewById<Button>(R.id.buttonNumberNineEngineer)
        val buttonNumberZeroEngineer = findViewById<Button>(R.id.buttonNumberZeroEngineer)
        val buttonPlusEngineer = findViewById<Button>(R.id.buttonPlusEngineer)
        val buttonMinusEngineer = findViewById<Button>(R.id.buttonMinusEngineer)
        val buttonMultiplyEngineer = findViewById<Button>(R.id.buttonMultiplyEngineer)
        val buttonDivideEngineer = findViewById<Button>(R.id.buttonDivideEngineer)
        val buttonEqualsEngineer = findViewById<Button>(R.id.buttonEqualsEngineer)
        val buttonPointEngineer = findViewById<Button>(R.id.buttonPointEngineer)
        val buttonOpenBasicCalculator = findViewById<Button>(R.id.buttonOpenBasicCalculator)
        val buttonPercentEngineer = findViewById<Button>(R.id.buttonPercentEngineer)
        val buttonClearEngineer = findViewById<Button>(R.id.buttonClearEngineer)
        val buttonClearAllEngineer = findViewById<Button>(R.id.buttonClearAllEngineer)
        val buttonDegree = findViewById<Button>(R.id.buttonDegree)
        val buttonRoot = findViewById<Button>(R.id.buttonRoot)
        val buttonFactorial = findViewById<Button>(R.id.buttonFactorial)
        val buttonSin = findViewById<Button>(R.id.buttonSin)
        val buttonCos = findViewById<Button>(R.id.buttonCos)
        tvResultEngineer = findViewById(R.id.tvResultEngineer)
        tvResultEngineer.setText("")
        calculations = ""
        buttonNumberOneEngineer.setOnClickListener { view: View? ->
            calculations += "1"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberTwoEngineer.setOnClickListener { view: View? ->
            calculations += "2"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberThreeEngineer.setOnClickListener { view: View? ->
            calculations += "3"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberFourEngineer.setOnClickListener { view: View? ->
            calculations += "4"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberFiveEngineer.setOnClickListener { view: View? ->
            calculations += "5"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberSixEngineer.setOnClickListener { view: View? ->
            calculations += "6"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberSevenEngineer.setOnClickListener { view: View? ->
            calculations += "7"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberEightEngineer.setOnClickListener { view: View? ->
            calculations += "8"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberNineEngineer.setOnClickListener { view: View? ->
            calculations += "9"
            tvResultEngineer.setText(calculations)
        }
        buttonNumberZeroEngineer.setOnClickListener { view: View? ->
            calculations += "0"
            tvResultEngineer.setText(calculations)
        }
        buttonPlusEngineer.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonMinusEngineer.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonMultiplyEngineer.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonDivideEngineer.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonPointEngineer.setOnClickListener { view: View? ->
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
                        if (calculations.get(i) == '.') {
                            havePoint = true
                            break
                        } else if (calculations.get(i) == ' ') {
                            break
                        }
                    }
                    if (!havePoint) {
                        calculations += "."
                        tvResultEngineer.setText(calculations)
                    }
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonPercentEngineer.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonClearEngineer.setOnClickListener { view: View? ->
            try {
                calculations = calculations.substring(0, calculations.length - 1)
                tvResultEngineer.setText(calculations)
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonClearAllEngineer.setOnClickListener { view: View? ->
            calculations = ""
            tvResultEngineer.setText(calculations)
        }
        buttonEqualsEngineer.setOnClickListener { view: View? ->
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
                        calculator!!.calculatorHandleLine(calculations).replaceAll("\\.?0*$", "")
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: IndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonOpenBasicCalculator.setOnClickListener { view: View? ->
            val intent = Intent(this, BasicCalculator::class.java)
            intent.putExtra(key, calculations)
            startActivity(intent)
            finish()
        }
        val bcCalculations = intent.getStringExtra(key)
        if (bcCalculations != null) calculations = bcCalculations
        tvResultEngineer.setText(calculations)
        buttonDegree.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonRoot.setOnClickListener { view: View? ->
            try {
                if (calculations == "" || !calculations.substring(calculations.length - 1)
                        .chars()
                        .allMatch { codePoint: Int ->
                            Character.isDigit(
                                codePoint
                            )
                        } && calculations.get(calculations.length - 2) != '√' && calculations.substring(
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonFactorial.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonSin.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
        buttonCos.setOnClickListener { view: View? ->
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
                    tvResultEngineer.setText(calculations)
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s.message)
            }
        }
    }
}