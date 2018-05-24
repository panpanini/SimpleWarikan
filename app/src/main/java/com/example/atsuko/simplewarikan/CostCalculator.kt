package com.example.atsuko.simplewarikan

class CostCalculator {

    fun calculateCost(cost: String, peopleCount: String): String {
        return try {
            if ((peopleCount.toInt() > -1) && cost.toDouble() > -1) {
                val result = (cost.toDouble() / peopleCount.toInt())
                val divider = result.toInt()
                if ((result.rem(divider)) == (0.0)) {
                    return result.toInt().toString()
                } else {
                    result.toString()
                }
            } else {
                ""
            }
        } catch (exception: NumberFormatException) {
            ""
        }
    }
}
