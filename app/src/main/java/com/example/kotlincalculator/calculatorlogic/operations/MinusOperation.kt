package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.MinusOperationInterface
import java.math.BigDecimal

class MinusOperation : MinusOperationInterface {
    override fun minus(firstNumber: BigDecimal, secondNumber: BigDecimal) =
        firstNumber.subtract(secondNumber).toString()
}