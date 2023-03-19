package com.example.kotlincalculator.calculatorlogic

class Calculator {
    private val lineHandler: LineHandler = LineHandler()
    fun calculatorHandleLine(calculations: String): String {
        return lineHandler.handleLine(calculations)
    }
}