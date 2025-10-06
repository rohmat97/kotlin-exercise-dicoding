package com.dicoding.exam.exam5

import kotlinx.coroutines.delay

// TODO 1: Jadikan suspend, tunda 3 detik, lalu jumlahkan
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3_000)
    return valueA + valueB
}

// TODO 2: Jadikan suspend, tunda 2 detik, lalu kalikan
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2_000)
    return valueA * valueB
}
