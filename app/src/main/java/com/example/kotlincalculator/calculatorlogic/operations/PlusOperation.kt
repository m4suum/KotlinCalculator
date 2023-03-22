package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.PlusOperationInterface
import java.math.BigDecimal

class PlusOperation : PlusOperationInterface {
    override fun plus(firstNumber: BigDecimal, secondNumber: BigDecimal) =
        firstNumber.add(secondNumber).toString()
}