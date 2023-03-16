package com.example.kotlincalculator.calculatorlogic

object CosineOperation {
    fun cos(number: Float): Float {
        return kotlin.math.cos(Math.toRadians(number.toDouble())).toFloat()
    }
}