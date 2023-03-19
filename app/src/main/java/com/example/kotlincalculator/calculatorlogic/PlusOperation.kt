package com.example.kotlincalculator.calculatorlogic

import java.math.BigDecimal

class PlusOperation {
    fun plus(firstNumber: BigDecimal, secondNumber: BigDecimal) =
        firstNumber.add(secondNumber).toString()
}