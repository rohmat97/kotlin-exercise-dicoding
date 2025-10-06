package com.dicoding.exam.optionalexam1

// TODO: Jumlahkan 3 angka paling besar.
// Pendekatan unik: pelihara tiga nilai maksimum tanpa melakukan sort.
fun sumOfBigThree(vararg numbers: Int): Int {
    var max1 = Int.MIN_VALUE // terbesar
    var max2 = Int.MIN_VALUE // kedua
    var max3 = Int.MIN_VALUE // ketiga

    for (n in numbers) {
        when {
            n >= max1 -> { max3 = max2; max2 = max1; max1 = n }
            n >= max2 -> { max3 = max2; max2 = n }
            n >= max3 -> { max3 = n }
        }
    }

    // Jika kurang dari 3 angka, tetap jumlahkan yang ada (filter MIN_VALUE)
    val kandidat = listOf(max1, max2, max3).filter { it != Int.MIN_VALUE }
    return kandidat.take(3).sum()
}
