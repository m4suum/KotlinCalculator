package com.example.kotlincalculator.calculatorlogic

import com.example.kotlincalculator.calculatorlogic.Extensions.Companion.convertResult

class LineHandler {
    private val plusOperation: PlusOperation = PlusOperation()
    private val minusOperation: MinusOperation = MinusOperation()
    private val multiplyOperation: MultiplyOperation = MultiplyOperation()
    private val divideOperation: DivideOperation = DivideOperation()
    private val percentOperation: PercentOperation = PercentOperation()
    private val degreeOperation: DegreeOperation = DegreeOperation()
    private val rootOperation: RootOperation = RootOperation()
    private val factorialOperation: FactorialOperation = FactorialOperation()
    private val sineOperation: SineOperation = SineOperation()
    private val cosineOperation: CosineOperation = CosineOperation()

    fun handleLine(lineOfCalculations: String): String {
        var firstResult: String?
        val strings = lineOfCalculations.split(" ").toTypedArray().toMutableList()

        for (i in strings.size-1 downTo 0) {
            when (strings[i]) {
                "sin" -> {
                    firstResult = sineOperation.sin(strings[i + 1].toDouble()).convertResult()
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i + 1)
                }
                "cos" -> {
                    firstResult = cosineOperation.cos(strings[i + 1].toDouble()).convertResult()
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i + 1)
                }
                "√" -> {
                    firstResult = rootOperation.root(strings[i + 1].toBigDecimal()).convertResult()
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i + 1)
                }
                "!" -> {
                    firstResult =
                        factorialOperation.factorial(strings[i - 1].toDouble()).toString()
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i - 1)
                }
                "%" -> {
                    firstResult = percentOperation.percent(strings[i - 1].toBigDecimal())
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i - 1)
                }
                "^" -> {
                    firstResult =
                        degreeOperation.degree(strings[i - 1].toDouble(), strings[i + 1].toDouble())
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
            }
        }
        for (i in strings.size-1 downTo 0) {
            when (strings[i]) {
                "*" -> {
                    firstResult = multiplyOperation.multiply(
                        strings[i + 1].toBigDecimal(),
                        strings[i - 1].toBigDecimal()
                    )
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
                "/" -> {
                    firstResult =
                        divideOperation.divide(
                            strings[i - 1].toBigDecimal(),
                            strings[i + 1].toBigDecimal()
                        )
                    if (firstResult == "Нельзя делить на ноль"){
                        return firstResult;
                    }
                    strings.removeAt(i)
                    strings.add(i, firstResult)
                    strings.removeAt(i + 1)
                    strings.removeAt(i - 1)
                }
            }
        }
        var finalResult = strings[0]
        for (i in 0 until strings.size) {
            when (strings[i]) {
                "+" -> finalResult =
                    plusOperation.plus(finalResult.toBigDecimal(), strings[i + 1].toBigDecimal())
                "-" -> finalResult =
                    minusOperation.minus(finalResult.toBigDecimal(), strings[i + 1].toBigDecimal())
            }
        }
        return finalResult.replace("\\.0*$".toRegex(), "")

    }
}
