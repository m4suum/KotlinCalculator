package com.example.kotlincalculator.calculatorlogic.operationinterfaces

import java.math.BigDecimal

interface PlusOperationInterface {
    fun plus(firstNumber: BigDecimal, secondNumber: BigDecimal): String
}