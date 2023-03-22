package com.example.kotlincalculator.calculatorlogic

import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.removeNulls
import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.convertResult
import com.example.kotlincalculator.calculatorlogic.operations.*

class LineHandler {
    private val calculator: Calculator = Calculator(
        PlusOperation(),
        MinusOperation(),
        MultiplyOperation(),
        DivideOperation(),
        SineOperation(),
        CosineOperation(),
        DegreeOperation(),
        RootOperation(),
        FactorialOperation(),
        PercentOperation()
    )

    /**Пример использования паттерна Фасад*/
    fun handleLine(lineOfCalculations: String): String {
        var result: String
        val strings = lineOfCalculations.split(" ").toTypedArray().toMutableList()

        /**Как учиили в школе: сначала выполняются функции первого блока for */
        for (i in strings.size - 1 downTo 0) {
            when (strings[i]) {
                "sin" -> {
                    result = calculator.sin(strings[i + 1].toDouble()).convertResult()
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i + 1)
                }
                "cos" -> {
                    result = calculator.cos(strings[i + 1].toDouble()).convertResult()
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i + 1)
                }
                "√" -> {
                    result = calculator.root(strings[i + 1].toBigDecimal()).convertResult()
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i + 1)
                }
                "!" -> {
                    result =
                        calculator.factorial(strings[i - 1].toDouble()).toString()
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i - 1)
                }
                "%" -> {
                    result = calculator.percent(strings[i - 1].toBigDecimal())
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i - 1)
                }
                "^" -> {
                    result =
                        calculator.degree(strings[i - 1].toDouble(), strings[i + 1].toDouble())
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
            }
        }

        /**Следующий блок for - умножение деление*/
        for (i in strings.size - 1 downTo 0) {
            when (strings[i]) {
                "*" -> {
                    result = calculator.multiply(
                        strings[i + 1].toBigDecimal(),
                        strings[i - 1].toBigDecimal()
                    )
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
                "/" -> {
                    result =
                        calculator.divide(
                            strings[i - 1].toBigDecimal(),
                            strings[i + 1].toBigDecimal()
                        )
                    if (result == "Нельзя делить на ноль") return result
                    strings.removeAt(i)
                    strings.add(i, result)
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
            }
        }
        result = strings[0]

        /**Последними операциями являются плюс и минус*/
        for (i in 0 until strings.size) {
            when (strings[i]) {
                "+" -> result =
                    calculator.plus(result.toBigDecimal(), strings[i + 1].toBigDecimal())
                "-" -> result =
                    calculator.minus(result.toBigDecimal(), strings[i + 1].toBigDecimal())
            }
        }
        return result.replace("\\.0*$".toRegex(), "").removeNulls()
        /**Возвращаем результат без нулей после точки в десятичной записи числа ex (10.0 -> 10)
         * (0.4000000 -> 0.4*/
    }
}
