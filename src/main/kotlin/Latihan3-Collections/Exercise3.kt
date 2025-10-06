package Latihan3.Collections

/**
 * Rangkuman Collections
 * 
 * Collections digunakan untuk menyimpan dan mengelola sekumpulan data.
 * Terdapat beberapa jenis collections: List, Set, dan Map.
 */

fun main() {
    // Exercise 3 - Collections
    
    // List - menyimpan sekumpulan nilai yang diurutkan berdasarkan posisi (indeks)
    val immutableList = listOf("Kotlin", "Java", "Python")
    println("Immutable List: $immutableList")
    
    val mutableList = mutableListOf("Kotlin", "Java", "Python")
    mutableList.add("JavaScript")
    println("Mutable List: $mutableList")
    
    // Set - hanya menyimpan nilai unik
    val immutableSet = setOf(1, 2, 3, 3, 4, 4, 5)
    println("Immutable Set (otomatis menghilangkan duplikat): $immutableSet")
    
    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(4)
    mutableSet.add(3) // Tidak akan ditambahkan karena sudah ada
    println("Mutable Set: $mutableSet")
    
    // Map - menyimpan data dalam format key-value
    val immutableMap = mapOf("Kotlin" to 2016, "Java" to 1995, "Python" to 1991)
    println("Immutable Map: $immutableMap")
    
    val mutableMap = mutableMapOf("Kotlin" to 2016, "Java" to 1995)
    mutableMap["Python"] = 1991 // Menambahkan elemen
    mutableMap["Kotlin"] = 2010 // Memperbarui value
    println("Mutable Map: $mutableMap")
    
    // Built-in functions untuk collections
    
    // Filter - menyaring data berdasarkan kondisi
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Angka genap: $evenNumbers")
    
    // Map - mengubah setiap nilai dalam collection
    val squaredNumbers = numbers.map { it * it }
    println("Angka kuadrat: $squaredNumbers")
    
    // Sorted - mengurutkan elemen
    val unsortedNumbers = listOf(5, 2, 8, 1, 9)
    val sortedNumbers = unsortedNumbers.sorted()
    println("Angka terurut: $sortedNumbers")
    
    // Slice - mengambil elemen di indeks tertentu
    val slicedNumbers = numbers.slice(2..5)
    println("Slice indeks 2-5: $slicedNumbers")
}
