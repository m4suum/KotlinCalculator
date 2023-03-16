package com.example.kotlincalculator.calculatorlogic

object Calculator {
    private val lineHandler: LineHandler = LineHandler
    fun calculatorHandleLine(calculations: String): String {
        return lineHandler.handleLine(calculations)
    }
}