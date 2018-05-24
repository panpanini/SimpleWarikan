package com.example.atsuko.simplewarikan

class CostCalculator {


    fun calculateCost(cost: String, peopleCount: String): String {
        //if (cost.isEmpty() || peopleCount.isEmpty()) return ""
        if (!"""\d+""".toRegex().matches(peopleCount)) return ""
        if (!"""\d+(\.\d+)?""".toRegex().matches(cost)) return ""
        val d = cost.toDouble() / peopleCount.toInt()

        return d.toString().replace("""(\d+(\.[^0]+)?).*""".toRegex(), "$1")
    }
}
