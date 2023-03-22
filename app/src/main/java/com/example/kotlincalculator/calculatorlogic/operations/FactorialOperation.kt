package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.FactorialOperationInterface

class FactorialOperation : FactorialOperationInterface {
    override fun factorial(number: Double): Double {
        return if (number <= 1.0) 1.0
        else {
            number * factorial(number - 1.0)
        }
    }
}