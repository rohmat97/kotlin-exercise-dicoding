package com.dicoding.exam.optionalexam4

// TODO: Ambil 1 atau 2 karakter paling tengah bergantung panjang teks
fun getMiddleCharacters(string: String): String {
    val len = string.length
    return if (len % 2 == 0) {
        // Jika panjang string genap, ambil 2 karakter paling tengah
        val start = len / 2 - 1
        string.substring(start, start + 2)
    } else {
        // Jika panjang string ganjil, ambil 1 karakter paling tengah
        val mid = len / 2
        string[mid].toString()
    }
}