package com.dicoding.exam.exam2

// TODO 1: Hitung sesuai rumus dengan nilai default 50 ketika valueC null
// Gaya unik: gunakan Elvis operator untuk menetapkan nilai pengganti
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    val c = valueC ?: 50
    return valueA + valueB - c
}

// TODO 2: Format teks hasil
fun result(result: Int): String {
    return "Result is $result"
}