package com.dicoding.exam.optionalexam2

// TODO: Hitung jumlah digit terkecil + terbesar dari angka yang diberikan
fun minAndMax(number: Int): Int {
    // Ubah ke string, pecah ke list digit, lalu cari min dan max
    val digits = number.toString().map { it.digitToInt() }
    val terkecil = digits.minOrNull() ?: 0
    val terbesar = digits.maxOrNull() ?: 0
    return terkecil + terbesar
}
