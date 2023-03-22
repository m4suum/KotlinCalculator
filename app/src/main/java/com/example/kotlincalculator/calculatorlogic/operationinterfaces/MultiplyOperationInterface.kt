package com.example.kotlincalculator.calculatorlogic.operationinterfaces

import java.math.BigDecimal

interface MultiplyOperationInterface {
    fun multiply(firstNumber: BigDecimal, secondNumber: BigDecimal): String
}