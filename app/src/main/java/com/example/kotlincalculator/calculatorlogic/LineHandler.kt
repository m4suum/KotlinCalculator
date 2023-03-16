package com.example.kotlincalculator.calculatorlogic

import java.util.*

object LineHandler {
    private val plusOperation: PlusOperation = PlusOperation
    private val minusOperation: MinusOperation = MinusOperation
    private val multiplyOperation: MultiplyOperation = MultiplyOperation
    private val divideOperation: DivideOperation = DivideOperation
    private val percentOperation: PercentOperation = PercentOperation
    private val degreeOperation: DegreeOperation = DegreeOperation
    private val rootOperation: RootOperation = RootOperation
    private val factorialOperation: FactorialOperation = FactorialOperation
    private val sineOperation: SineOperation = SineOperation
    private val cosineOperation: CosineOperation = CosineOperation

    fun handleLine(lineOfCalculations: String): String {
        var firstResult: Float
        val strings = ArrayList(
            mutableListOf(
                *lineOfCalculations.split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                    .toTypedArray()))
        for (i in strings.indices.reversed()) {
            when (strings[i]) {
                "sin" -> {
                    firstResult = sineOperation.sin(strings[i + 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i + 1)
                }
                "cos" -> {
                    firstResult = cosineOperation.cos(strings[i + 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i + 1)
                }
                "√" -> {
                    firstResult = rootOperation.root(strings[i + 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i + 1)
                }
                "!" -> {
                    firstResult = factorialOperation.factorial(strings[i - 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i - 1)
                }
                "%" -> {
                    firstResult = percentOperation.percent(strings[i - 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i - 1)
                }
            }
        }
        for (i in strings.indices.reversed()) {
            when (strings[i]) {
                "*" -> {
                    firstResult = multiplyOperation.multiply(
                        strings[i + 1].toFloat(),
                        strings[i - 1].toFloat()
                    )
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
                "/" -> {
                    firstResult =
                        divideOperation.divide(strings[i - 1].toFloat(), strings[i + 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
                "^" -> {
                    firstResult =
                        degreeOperation.degree(strings[i - 1].toFloat(), strings[i + 1].toFloat())
                    strings.removeAt(i)
                    strings.add(i, firstResult.toString())
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
            }
        }
        var finalResult = strings[0].toFloat()
        for (i in 0 until strings.size - 1) {
            when (strings[i]) {
                "+" -> finalResult = plusOperation.plus(finalResult, strings[i + 1].toFloat())
                "-" -> finalResult = minusOperation.minus(finalResult, strings[i + 1].toFloat())
            }
        }
        return finalResult.toString()
    }
}