package com.dicoding.exam.exam1

// Implementasi dalam Bahasa Indonesia agar jelas dan unik.
// TODO 1: Cek apakah angka genap.
// Trik: gunakan operasi bitwise (angka genap memiliki bit terakhir = 0)
fun isEvenNumber(number: Int): Boolean {
    return (number and 1) == 0
}

// TODO 2: Cek apakah lebih dari lima
fun moreThanFive(number: Int): Boolean {
    return number > 5
}

// TODO 3: Rumus: number x (number + 10)
fun result(number: Int): Int {
    return number * (number + 10)
}