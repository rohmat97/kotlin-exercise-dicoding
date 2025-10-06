package Latihan4.OOP

/**
 * Rangkuman Kotlin Object-Oriented Programming
 * 
 * OOP adalah paradigma pemrograman yang membangun program dengan objek-objek
 * yang dapat berinteraksi satu sama lain.
 */

// Class dengan property dan method
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Halo, nama saya $name dan saya berusia $age tahun.")
    }
}

// Inheritance
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name membuat suara")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name menggonggong: Woof woof!")
    }
}

// Encapsulation dengan visibility modifier
class BankAccount(private val accountNumber: String, private var balance: Double) {
    fun getBalance(): Double {
        return balance
    }
    
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit berhasil. Saldo sekarang: $balance")
        }
    }
    
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Penarikan berhasil. Saldo sekarang: $balance")
        } else {
            println("Penarikan gagal. Saldo tidak mencukupi.")
        }
    }
}

// Data class
data class Student(val id: Int, val name: String, val grade: String)

// Singleton object
object MathUtils {
    fun add(a: Int, b: Int): Int = a + b
    fun multiply(a: Int, b: Int): Int = a * b
}

fun main() {
    // Exercise 4 - OOP
    
    // Membuat instance dari class Person
    val person = Person("Andi", 25)
    person.introduce()
    
    // Inheritance dan polymorphism
    val dog = Dog("Buddy")
    dog.makeSound()
    
    // Encapsulation
    val account = BankAccount("1234567890", 1000.0)
    println("Saldo awal: ${account.getBalance()}")
    account.deposit(500.0)
    account.withdraw(200.0)
    
    // Data class
    val student = Student(1, "Budi", "A")
    println("Student: $student")
    
    // Singleton object
    println("Hasil penjumlahan: ${MathUtils.add(5, 3)}")
    println("Hasil perkalian: ${MathUtils.multiply(4, 6)}")
    
    // Extension function
    fun String.isPalindrome(): Boolean {
        return this == this.reversed()
        }
    
    val text = "katak"
    println("Apakah '$text' palindrome? ${text.isPalindrome()}")
}
