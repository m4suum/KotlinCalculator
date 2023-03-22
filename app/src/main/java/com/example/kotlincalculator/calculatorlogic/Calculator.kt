package com.example.kotlincalculator.calculatorlogic

import com.example.kotlincalculator.calculatorlogic.operationinterfaces.*

/**В данном классе  используется делегирование*/
class Calculator(
    private val plusOperation: PlusOperationInterface,
    private val minusOperation: MinusOperationInterface,
    private val multiplyOperation: MultiplyOperationInterface,
    private val divideOperation: DivideOperationInterface,
    private val sineOperation: SineOperationInterface,
    private val cosineOperation: CosineOperationInterface,
    private val degreeOperation: DegreeOperationInterface,
    private val rootOperation: RootOperationInterface,
    private val factorialOperation: FactorialOperationInterface,
    private val percentOperation: PercentOperationInterface
) : PlusOperationInterface by plusOperation, MinusOperationInterface by minusOperation,
    MultiplyOperationInterface by multiplyOperation, DivideOperationInterface by divideOperation,
    SineOperationInterface by sineOperation, CosineOperationInterface by cosineOperation,
    DegreeOperationInterface by degreeOperation, RootOperationInterface by rootOperation,
    FactorialOperationInterface by factorialOperation,
    PercentOperationInterface by percentOperation