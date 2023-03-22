package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.PercentOperationInterface
import java.math.BigDecimal

class PercentOperation : PercentOperationInterface {
    override fun percent(number: BigDecimal) = number.divide(100.0.toBigDecimal()).toString()
}