package com.example.kotlincalculator.calculatorlogic

import java.math.BigDecimal

class MinusOperation {
    fun minus(firstNumber: BigDecimal, secondNumber: BigDecimal) =
        firstNumber.subtract(secondNumber).toString()
}