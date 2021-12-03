package day01


import java.io.File

fun main() {
    fun part1(input: List<Int>): Int {
        val a = input.map { it }
        return a.zipWithNext().count { (x, y) -> y > x }
    }

    fun part2(input: List<Int>): Int {
        val a = input.map { it }
        return a.windowed(3).map { it.sum() }.zipWithNext().count { (x, y) -> y > x }
    }

    // test if implementation meets criteria from the description, like:

    val inputTest = File("inputs/Day01_test.txt").readLines().map { it.toInt() }
    println(part1(inputTest))
    println(part2(inputTest))

    val input = File("inputs/day01.txt").readLines().map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
