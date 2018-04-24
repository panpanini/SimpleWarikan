package com.example.atsuko.simplewarikan

class CostCalculator {


    fun calculateCost(cost: String, peopleCount: String): String {
        return (cost.toInt() / peopleCount.toInt()).toString()
    }
}