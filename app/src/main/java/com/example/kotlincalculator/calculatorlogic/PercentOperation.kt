package com.example.kotlincalculator.calculatorlogic

import java.math.BigDecimal

class PercentOperation {
    fun percent(number: BigDecimal) = number.divide(100.0.toBigDecimal()).toString()
}