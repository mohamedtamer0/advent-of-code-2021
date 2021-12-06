import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "../inputs/$name.txt").readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)


fun readFile(fileName: String): List<String> {
    return object {}.javaClass.classLoader.getResource(fileName)!!
        .readText(Charsets.UTF_8)
        .lines()
        .map { it.trim() }
}

fun <T> readFile(fileName: String, transformation: (String) -> T): List<T> {
    return readFile(fileName)
        .map(transformation)
}