package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.MultiplyOperationInterface
import java.math.BigDecimal

class MultiplyOperation : MultiplyOperationInterface {
    override fun multiply(firstNumber: BigDecimal, secondNumber: BigDecimal) =
        firstNumber.multiply(secondNumber).toString()
}