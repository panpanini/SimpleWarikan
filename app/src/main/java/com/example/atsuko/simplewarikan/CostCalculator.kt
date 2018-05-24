package com.example.atsuko.simplewarikan

class CostCalculator {


    fun calculateCost(cost: String, peopleCount: String): String {

        if (cost == "" || peopleCount == "")
            return ""

        try {
            cost.toInt()
            peopleCount.toInt()
        } catch (e: Exception) {
            return ""
        }

        val result = (cost.toInt() / peopleCount.toInt())

        if (result < 0) {
            return ""
        } else {
            return result.toString()
        }
    }
}
