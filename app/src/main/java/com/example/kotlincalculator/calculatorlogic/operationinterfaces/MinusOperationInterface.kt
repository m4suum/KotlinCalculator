package com.example.kotlincalculator.calculatorlogic.operationinterfaces

import java.math.BigDecimal

interface MinusOperationInterface {
    fun minus(firstNumber: BigDecimal, secondNumber: BigDecimal): String
}