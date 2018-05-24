package com.example.atsuko.simplewarikan

class CostCalculator {


    fun calculateCost(cost: String, peopleCount: String): String {
        if (!"""\d+(\.\d+)?""".toRegex().matches(cost)) return ""
        if (!"""\d+""".toRegex().matches(peopleCount)) return ""
        val calculated = cost.toDouble() / peopleCount.toInt()
        return calculated.toString().replace("""(\d+(\.[^0]+)?).*""".toRegex(), "$1")
    }
}
