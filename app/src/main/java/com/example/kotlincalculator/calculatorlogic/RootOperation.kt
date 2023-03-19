package com.example.kotlincalculator.calculatorlogic

import java.math.BigDecimal
import kotlin.math.sqrt

class RootOperation {
    fun root(number: BigDecimal) = sqrt(number.toDouble()).toBigDecimal().toString()
}