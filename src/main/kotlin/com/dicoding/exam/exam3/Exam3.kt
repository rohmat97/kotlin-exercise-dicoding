package com.dicoding.exam.exam3

// TODO: Kembalikan Map sesuai spesifikasi README.
// Menggunakan LinkedHashMap agar urutan key tetap (lebih mudah dibaca saat dicetak).
fun vehicle(): Map<String, String> {
    return linkedMapOf(
        "type" to "motorcycle",
        "maxSpeed" to "230Km/s",
        "maxTank" to "100Ltr"
    )
}