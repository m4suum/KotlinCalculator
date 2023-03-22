package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.DegreeOperationInterface
import kotlin.math.pow

class DegreeOperation : DegreeOperationInterface {
    override fun degree(firstNumber: Double, secondNumber: Double) =
        firstNumber.pow(secondNumber).toString()
}