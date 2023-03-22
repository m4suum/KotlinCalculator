package com.example.kotlincalculator.calculatorlogic.operationinterfaces

import java.math.BigDecimal

interface RootOperationInterface {
    fun root(number: BigDecimal): String
}