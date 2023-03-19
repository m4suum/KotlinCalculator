package com.example.kotlincalculator.calculatorlogic

import java.math.BigDecimal

class MultiplyOperation {
    fun multiply(firstNumber: BigDecimal, secondNumber: BigDecimal) =
        firstNumber.multiply(secondNumber).toString()
}