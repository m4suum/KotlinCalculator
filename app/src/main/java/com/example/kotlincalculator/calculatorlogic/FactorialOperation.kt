package com.example.kotlincalculator.calculatorlogic

object FactorialOperation {
    fun factorial(number: Float): Float {
        return if (number <= 1) 1f
        else {
            number * factorial(number - 1)
        }
    }
}