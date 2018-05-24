package com.example.atsuko.simplewarikan

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CostCalculatorTest {

    private lateinit var target: CostCalculator

    @Before
    fun before() {
        target = CostCalculator()
    }


    @Test
    fun calculateCost() {
        /*
            cost = 1000
            people = 2
            expect result = 500
         */

        val cost = "1000"
        val people = "2"
        val expect = "500"

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)

    }

    @Test
    fun calculateCost_can_handle_empty_cost() {
        /*
            cost = ""
            people = "2"
            expect result = ""
         */

        val cost = ""
        val people = "2"
        val expect = ""

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)
    }

    @Test
    fun calculate_cost_should_not_handle_partial_people() {
        /*
            cost = "10"
            people = "2.5"
            expect result ""
         */

        val cost = "10"
        val people = "2.5"
        val expect = ""

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)
    }

    @Test
    fun calculate_cost_can_handle_partial_dollars() {
        /*
            cost = "10.5"
            people = "2"
            expect result "5.25"
         */

        val cost = "10.5"
        val people = "2"
        val expect = "5.25"

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)
    }

    @Test
    fun calculate_cost_should_not_handle_negative_cost() {
        /*
            cost = "-10"
            people = "2"
            expect result ""
         */

        val cost = "-10"
        val people = "2"
        val expect = ""

        val result = target.calculateCost(cost, people) // -5

        assertEquals(expect, result)
    }

    @Test
    fun calculate_cost_should_not_handle_negative_people() {
        /*
            cost = "10"
            people = "-2"
            expect result ""
         */

        val cost = "10"
        val people = "-2"
        val expect = ""

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)
    }

    @Test
    fun calculate_cost_should_not_handle_non_number_cost() {
        /*
            cost = "aaa"
            people = "2"
            expect result ""
         */

        val cost = "aaa"
        val people = "2"
        val expect = ""

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)
    }

    @Test
    fun calculate_cost_should_not_handle_non_number_people() {
        /*
            cost = "10"
            people = "two"
            expect result ""
         */

        val cost = "10"
        val people = "two"
        val expect = ""

        val result = target.calculateCost(cost, people)

        assertEquals(expect, result)
    }

}
