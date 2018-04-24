package com.example.atsuko.simplewarikan

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
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

    }

    @Test
    fun calculateCost_can_handle_empty_cost() {
        /*
            cost = ""
            people = "2"
            expect result = ""
         */
    }

    @Test
    fun calculate_cost_should_not_handle_partial_people() {
        /*
            cost = "10"
            people = "2.5"
            expect result ""
         */

    }

    @Test
    fun calculate_cost_can_handle_partial_dollars() {
        /*
            cost = "10.5"
            people = "2"
            expect result "5.25"
         */
    }

    @Test
    fun calculate_cost_should_not_handle_negative_cost() {
        /*
            cost = "-10"
            people = "2"
            expect result ""
         */
    }

    @Test
    fun calculate_cost_should_not_handle_negative_people() {
        /*
            cost = "10"
            people = "-2"
            expect result ""
         */
    }

    @Test
    fun calculate_cost_should_not_handle_non_number_cost() {
        /*
            cost = "aaa"
            people = "2"
            expect result ""
         */
    }

    @Test
    fun calculate_cost_should_not_handle_non_number_people() {
        /*
            cost = "10"
            people = "two"
            expect result ""
         */
    }

}