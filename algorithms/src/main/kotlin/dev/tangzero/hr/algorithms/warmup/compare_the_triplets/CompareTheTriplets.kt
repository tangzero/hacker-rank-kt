package dev.tangzero.hr.algorithms.warmup.compare_the_triplets

fun main() {
    val a = readIntList()
    val b = readIntList()
    println("${compare(a, b)} ${compare(b, a)}")
}

fun readIntList() = readLine()!!.split(" ").map(String::toInt)

fun compare(listA: List<Int>, listB: List<Int>) = listA
        .mapIndexed { index, element -> element.compareTo(listB[index]) }
        .filter { it > 0 }
        .sum()
