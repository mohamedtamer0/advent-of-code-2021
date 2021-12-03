package day02

import readInput

fun main() {
    val dayId = "02"
    val instr = readInput("Day${dayId}")
        .map { it.split(' ') }
        .map { (c, p) -> c to p.toInt() }
        .map { (it.first == "forward") to (it.second * if (it.first == "up") -1 else 1) }

    val a = instr.scan(0) { s, (f, p) -> s + (if (f) 0 else p) }
    val x = instr.filter { it.first }.sumOf { it.second }

    println(x * instr.filter { !it.first }.sumOf { it.second })
    println(x * instr.mapIndexed { i, (f, p) -> if (f) p*a[i] else 0 }.sum())
}