package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.SineOperationInterface

class SineOperation : SineOperationInterface {
    override fun sin(number: Double) = kotlin.math.sin(Math.toRadians(number)).toString()
}