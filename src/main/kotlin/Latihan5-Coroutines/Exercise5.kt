package Latihan5.Coroutines

import kotlinx.coroutines.*

/**
 * Rangkuman Kotlin Asynchronous: Coroutines
 * 
 * Coroutines merupakan fitur Kotlin yang digunakan untuk mengimplementasikan asynchronous programming.
 * Coroutine memanfaatkan mekanisme concurrency untuk mengatur jalannya beberapa proses secara bersamaan.
 * 
 * Kotlin menyediakan beberapa coroutine builder utama:
 * - runBlocking: untuk menjembatani kode synchronous dan asynchronous
 * - launch: untuk menjalankan proses asynchronous tanpa nilai kembali
 * - async: untuk menjalankan proses asynchronous yang menghasilkan nilai
 */

fun main() {
    // Exercise 5 - Coroutines
    
    println("=== Contoh Synchronous ===")
    // Contoh kode synchronous (blocking)
    runBlocking {
        println("Mulai proses synchronous")
        delay(1000) // Menunda eksekusi selama 1 detik
        println("Proses synchronous selesai")
    }
    
    println("\n=== Contoh Launch ===")
    // Contoh launch coroutine builder
    runBlocking {
        launch {
            delay(1000)
            println("Proses pertama selesai")
        }
        
        launch {
            delay(2000)
            println("Proses kedua selesai")
        }
        
        println("Menunggu semua proses selesai...")
    }
    
    println("\n=== Contoh Async ===")
    // Contoh async coroutine builder
    runBlocking {
        val deferredValue = async {
            delay(1000)
            42 // Mengembalikan nilai
        }
        
        println("Melakukan pekerjaan lain...")
        
        // Menunggu dan mendapatkan hasil
        val result = deferredValue.await()
        println("Hasil dari async: $result")
    }
    
    println("\n=== Perbandingan Synchronous vs Asynchronous ===")
    // Perbedaan synchronous dan asynchronous
    
    // Synchronous - eksekusi berurutan
    runBlocking {
        val start = System.currentTimeMillis()
        
        // Tiga proses synchronous yang dijalankan berurutan
        delay(1000)
        println("Proses 1 selesai (waktu: ${System.currentTimeMillis() - start} ms)")
        
        delay(1000)
        println("Proses 2 selesai (waktu: ${System.currentTimeMillis() - start} ms)")
        
        delay(1000)
        println("Proses 3 selesai (waktu: ${System.currentTimeMillis() - start} ms)")
        
        println("Total waktu eksekusi synchronous: ${System.currentTimeMillis() - start} ms")
    }
    
    println("\nAsynchronous - eksekusi paralel")
    runBlocking {
        val start = System.currentTimeMillis()
        
        // Tiga proses asynchronous yang dijalankan bersamaan
        val job1 = launch { delay(1000); println("Proses A selesai (waktu: ${System.currentTimeMillis() - start} ms)") }
        val job2 = launch { delay(1000); println("Proses B selesai (waktu: ${System.currentTimeMillis() - start} ms)") }
        val job3 = launch { delay(1000); println("Proses C selesai (waktu: ${System.currentTimeMillis() - start} ms)") }
        
        // Menunggu semua proses selesai
        job1.join()
        job2.join()
        job3.join()
        
        println("Total waktu eksekusi asynchronous: ${System.currentTimeMillis() - start} ms")
    }
}
