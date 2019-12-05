package dev.tangzero.hr.algorithms.warmup.a_very_big_sum

fun main() {
    readLine()!! // skip the first line
    val result = readLine()!!.split(" ").map(String::toLong).sum()
    println(result)
}
