package dev.tangzero.hr.algorithms.warmup.simple_array_sum

fun main() {
    readLine()!! // skip first line
    val result = readLine()!!.split(" ").map(String::toInt).sum()
    println(result)
}
