package com.example.calculatorapp

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    val calcy = Calculator()
    @Test
    fun addition_isCorrect() {
        calcy.num1 = 2.0
        calcy.num2 = 2.0
        assertEquals(4.0, calcy.add(), 0.0)
    }
    @Test
    fun sub_isCorrect() {
        calcy.num1 = 6.0
        calcy.num2 = 2.0
        assertEquals(4.0, calcy.sub(), 0.0)
    }
    @Test
    fun mul_isCorrect() {
        calcy.num1 = 2.0
        calcy.num2 = 2.0
        assertEquals(4.0, calcy.mul(), 0.0)
    }
    @Test
    fun div_isCorrect() {
        calcy.num1 = 2.0
        calcy.num2 = 2.0
        assertEquals(1.0, calcy.div(), 0.0)
    }
    @Test
    fun div2_isCorrect() {
        calcy.num1 = 2.0
        calcy.num2 = 0.0
        assertEquals(Double.POSITIVE_INFINITY, calcy.div(), 0.0)
    }
}