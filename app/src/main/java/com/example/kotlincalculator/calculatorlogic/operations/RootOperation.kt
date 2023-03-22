package com.example.kotlincalculator.calculatorlogic.operations

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.RootOperationInterface
import java.math.BigDecimal
import kotlin.math.sqrt

class RootOperation : RootOperationInterface {
    override fun root(number: BigDecimal) = sqrt(number.toDouble()).toBigDecimal().toString()
}