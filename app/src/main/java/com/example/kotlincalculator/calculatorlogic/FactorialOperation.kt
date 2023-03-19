package com.example.kotlincalculator.calculatorlogic

class FactorialOperation {
    fun factorial(number: Double): Double {
        return if (number <= 1.0) 1.0
        else {
            number * factorial(number - 1.0)
        }
    }
}