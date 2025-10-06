package Latihan1_TipeData

/**
 * Rangkuman Tipe Data
 * 
 * Variabel dapat menyimpan dan mengelola beragam jenis data. Umumnya, istilah tipe data digunakan untuk merujuk pada jenis data yang disimpan oleh suatu variabel.
 * 
 * Terdapat empat komponen yang menjadi struktur dari pendeklarasian variabel antara lain sebagai berikut.
 * Keyword Deklarasi Variabel
 * Terdapat dua jenis keyword, var dan val. Variabel dengan kata kunci var dapat senantiasa memperbarui nilainya. 
 * Sementara itu, variabel dengan kata kunci val tidak diperbolehkan untuk mengubah nilai inisialnya.
 * 
 * Tipe data di dalam Kotlin dapat dikategorikan menjadi tiga bentuk, yaitu teks, angka, dan boolean.
 */

fun main() {
    // Exercise 1 - Tipe Data
    
    // Deklarasi variabel dengan var (bisa diubah)
    var name = "Kotlin"
    println("Bahasa pemrograman: $name")
    
    // Deklarasi variabel dengan val (tidak bisa diubah)
    val year = 2025
    println("Tahun saat ini: $year")
    
    // Tipe data teks
    val charExample: Char = 'A'
    val stringExample: String = "Hello, Kotlin!"
    
    // String template
    println("Karakter: $charExample")
    println("Teks: $stringExample")
    
    // Tipe data angka
    val intExample: Int = 100
    val doubleExample: Double = 3.14
    
    println("Integer: $intExample")
    println("Double: $doubleExample")
    
    // Operator aritmatika
    val result = intExample + doubleExample
    println("Hasil penjumlahan: $result")
    
    // Tipe data boolean
    val isKotlinFun: Boolean = true
    val isJavaBetter: Boolean = false
    
    println("Apakah Kotlin menyenangkan? $isKotlinFun")
    println("Apakah Java lebih baik? $isJavaBetter")
    
    // Operator logika
    val bothTrue = isKotlinFun && (result > 0)
    val eitherTrue = isJavaBetter || isKotlinFun
    
    println("Kotlin fun dan result > 0: $bothTrue")
    println("Java better atau Kotlin fun: $eitherTrue")
    
    // Nullable types
    var nullableString: String? = null
    println("Nullable string: $nullableString")
    
    // Safe calls operator
    nullableString = "Sekarang tidak null"
    println("Panjang string: ${nullableString?.length}")
    
    // Elvis operator
    val length = nullableString?.length ?: 0
    println("Panjang string dengan elvis operator: $length")
}
