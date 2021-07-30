package com.example.myapplication.playground

fun main() {
    for (count in 0..10)// .. ใช้ until แทนได้้
    {
        print("$count ")
    }
    println()

    for (count in 10 downTo 0){
        print("$count ")
    }
    println()

    for (count in 0..10 step 2){
        print("$count ")
    }
    println()
    val arrayDemo = arrayOf("111 ",124 ,true)
    for (item in arrayDemo)
        print("$item")
}