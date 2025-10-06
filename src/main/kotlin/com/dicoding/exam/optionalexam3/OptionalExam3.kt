package com.dicoding.exam.optionalexam3

// TODO: Jika string mengandung angka, kalikan angka tersebut dengan input lalu gabungkan teksnya.
// Jika tidak ada angka, cukup gabungkan teks dengan angka input.
fun manipulateString(str: String, int: Int): String {
    val regex = Regex("\\d+")
    val match = regex.find(str)

    return if (match != null) {
        // Ambil bagian teks tanpa angka dan angka murninya
        val angka = match.value.toInt() // leading zero otomatis diabaikan
        val teks = str.replace(regex, "")
        teks + (angka * int)
    } else {
        str + int
    }
}
