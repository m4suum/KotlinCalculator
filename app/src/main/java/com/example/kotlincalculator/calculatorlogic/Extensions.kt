package com.example.kotlincalculator.calculatorlogic

import kotlin.math.roundToInt


class Extensions {
    companion object {

        /**Функция для получения правильных чисел при неправильном вычислении с Double*/
        fun String.convertResult(): String {
            try {
                if (this.substring(this.length - 17, this.length) == "49999999999999994") {
                    return ((this.toDouble() * 10.0).roundToInt() / 10.0).toString()
                } else if (this.substring(this.length - 15, this.length) == "000000000000001") {
                    return (this.replace("000000000000001", ""))
                }
            } catch (s: StringIndexOutOfBoundsException) {
                println(s)
            }
            return this
        }

        /**Функции для проверки, можно ли ставить тот или иной знак*/
        fun checkPlusMinusMultiplyDivideEquals(calculations: String): Boolean {
            return calculations.substring(calculations.length - 1) != " " && calculations.substring(
                calculations.length - 1
            ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                calculations.length - 1
            ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                calculations.length - 1
            ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                calculations.length - 1
            ) != "√" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                calculations.length - 1
            ) != "s"
        }

        fun checkPointPercentDegreeFactorial(calculations: String): Boolean {
            return calculations.substring(calculations.length - 1) != " " && calculations.substring(
                calculations.length - 1
            ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                calculations.length - 1
            ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                calculations.length - 1
            ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                calculations.length - 1
            ) != "√" && calculations.substring(calculations.length - 1) != "!" && calculations.substring(
                calculations.length - 1
            ) != "n" && calculations.substring(calculations.length - 1) != "s" && calculations.substring(
                calculations.length - 1
            ) != "%"
        }

        fun checkRoot(calculations: String): Boolean {
            return calculations.isEmpty() || !calculations[calculations.length - 1].isDigit()
                    && calculations[calculations.length - 2] != '√' && calculations.substring(
                calculations.length - 1
            ) != "." && calculations.substring(calculations.length - 1) != "+" && calculations.substring(
                calculations.length - 1
            ) != "-" && calculations.substring(calculations.length - 1) != "*" && calculations.substring(
                calculations.length - 1
            ) != "/" && calculations.substring(calculations.length - 1) != "^" && calculations.substring(
                calculations.length - 1
            ) != "√" && calculations.substring(calculations.length - 1) != "!" && calculations.substring(
                calculations.length - 1
            ) != "n" && calculations.substring(calculations.length - 1) != "s" && calculations.substring(
                calculations.length - 1
            ) != "%"
        }

        fun checkSinCos(calculations: String): Boolean {
            return calculations.isEmpty() || !calculations[calculations.length - 1].isDigit()
                    && calculations.substring(
                calculations.length - 1
            ) != "." && calculations.substring(
                calculations.length - 1
            ) != "+" && calculations.substring(calculations.length - 1) != "-" && calculations.substring(
                calculations.length - 1
            ) != "*" && calculations.substring(calculations.length - 1) != "/" && calculations.substring(
                calculations.length - 1
            ) != "^" && calculations.substring(calculations.length - 1) != "√" && calculations.substring(
                calculations.length - 1
            ) != "!" && calculations.substring(calculations.length - 1) != "n" && calculations.substring(
                calculations.length - 1
            ) != "s" && calculations.substring(calculations.length - 1) != "%"
        }

        fun String.removeNulls():String{
            return if (this.contains(".") && this.substring(this.length-1) == "0"){
                var count = 0
                for ( i in this.length-1 downTo this.indexOf(".")){
                    if (this.toCharArray()[i] == '0'){
                        count++
                    }
                }
                this.substring(0,this.length-count)
            }else {
                this
            }
        }
    }

}