package Latihan2.ControlFlow

/**
 * Rangkuman Control Flow
 * 
 * Control flow digunakan untuk mengatur alur eksekusi program berdasarkan kondisi atau perulangan.
 * Berdasarkan faktornya, control flow ini dapat dikelompokkan menjadi control flow kondisi dan control flow perulangan.
 */

fun main() {
    // Exercise 2 - Control Flow
    
    // If statement
    val number = 10
    if (number > 0) {
        println("$number adalah bilangan positif")
    } else if (number < 0) {
        println("$number adalah bilangan negatif")
    } else {
        println("$number adalah nol")
    }
    
    // If expression
    val result = if (number > 5) "Lebih besar dari 5" else "Kurang dari atau sama dengan 5"
    println(result)
    
    // When expression
    when (number) {
        in 1..10 -> println("$number berada dalam range 1-10")
        in 11..20 -> println("$number berada dalam range 11-20")
        else -> println("$number berada di luar range 1-20")
    }
    
    // For loop dengan range
    println("For loop dengan range:")
    for (i in 1..5) {
        println("Iterasi ke-$i")
    }
    
    // For loop dengan step
    println("For loop dengan step:")
    for (i in 1..10 step 2) {
        println("Iterasi ke-$i")
    }
    
    // While loop
    println("While loop:")
    var counter = 1
    while (counter <= 3) {
        println("Counter: $counter")
        counter++
    }
    
    // Do-while loop
    println("Do-while loop:")
    var doCounter = 1
    do {
        println("Do counter: $doCounter")
        doCounter++
    } while (doCounter <= 3)
    
    // Break dan continue
    println("Contoh break:")
    for (i in 1..10) {
        if (i == 5) break
        println("Angka: $i")
    }
    
    println("Contoh continue:")
    for (i in 1..5) {
        if (i == 3) continue
        println("Angka: $i")
    }
    
    // Exception handling
    println("Exception handling:")
    try {
        val result = 10 / 0
        println(result)
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    }
}
