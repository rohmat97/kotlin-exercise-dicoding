package com.dicoding.exam.exam4

// Implementasi OOP dengan gaya jelas dan ringkas.
// TODO: Class Car berisi merek (brand) dan tahun keluaran (year)
open class Car(val brand: String, val year: Int) {
    // Kembalikan format info sesuai ketentuan
    open fun getCarInfo(): String = "$brand keluaran tahun $year"
}

// TODO: ElectricCar mewarisi Car dan menambahkan kapasitas baterai
class ElectricCar(
    brand: String,
    year: Int,
    val batteryCapacity: Int
) : Car(brand, year) {
    // Override info agar menampilkan kapasitas baterai
    override fun getCarInfo(): String =
        "$brand keluaran tahun $year dengan kapasitas baterai $batteryCapacity kWh"
}