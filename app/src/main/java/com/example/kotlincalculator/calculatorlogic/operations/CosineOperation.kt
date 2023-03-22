package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.CosineOperationInterface

class CosineOperation : CosineOperationInterface {
    override fun cos(number: Double) =
        kotlin.math.cos(Math.toRadians(number)).toString()
}