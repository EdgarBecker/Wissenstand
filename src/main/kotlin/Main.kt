fun main() {

    println("Assignment 1:")
    anagram("hello", "lelho")
    anagram("Hello", "raijka")
    println()

    println("Assignment 2:")
    val isPrime = isPrimeNumber(3)
    println("Is a Prime: $isPrime")
    println()

    println("Assignment 3:")
    fibonacci(10)

}

//assignment 1
fun anagram(string1: String, string2: String) {
    val list1 = mutableListOf<Char>()
    val list2 = mutableListOf<Char>()

    string1.lowercase().forEach { list1.add(it) }
    string2.lowercase().forEach { list2.add(it) }

    if (list1.containsAll(list2)) {
        println("$string1 and $string2 is an anagram")
    } else {
        println("$string1 and $string2 is not an anagram")
    }
}

//assignment 2
fun isPrimeNumber(number: Int): Boolean {
    var isPrime = true
    for (i in 2..number / 2) {
        if (number % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}

//assigment 3
fun fibonacci(x: Int) {
    var n1 = 0
    var n2 = 1

    for (i in 1..x) {
        print("$n1 + ")

        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
}