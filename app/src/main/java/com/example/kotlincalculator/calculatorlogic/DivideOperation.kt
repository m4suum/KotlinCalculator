package com.example.kotlincalculator.calculatorlogic

import java.math.BigDecimal
import java.math.RoundingMode

class DivideOperation {

    fun divide(firstNumber: BigDecimal, secondNumber: BigDecimal): String {
        return when (secondNumber.toInt()) {
            0 ->
                "Нельзя делить на ноль"
            else -> firstNumber.divide(
                secondNumber, 10,
                RoundingMode.HALF_UP
            ).toString()
        }
    }
}
