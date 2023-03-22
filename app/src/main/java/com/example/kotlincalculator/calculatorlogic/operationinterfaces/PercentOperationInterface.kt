package com.example.kotlincalculator.calculatorlogic.operationinterfaces

import java.math.BigDecimal

interface PercentOperationInterface {
    fun percent(number: BigDecimal): String
}