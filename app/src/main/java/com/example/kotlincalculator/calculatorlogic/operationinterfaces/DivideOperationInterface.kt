package com.example.kotlincalculator.calculatorlogic.operationinterfaces

import java.math.BigDecimal

interface DivideOperationInterface {
    fun divide(firstNumber: BigDecimal, secondNumber: BigDecimal): String
}