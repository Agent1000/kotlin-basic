package com.example.myapplication.playground.oop

fun main() {
    val obj1  = Cat()
    obj1.say()
    obj1.run(21421)
}

open class Animal{
    var name = "-"
    var age = 0

    open fun say(){
        println("$name say: foooooo")
    }
}
class Cat: Animal() , Event{
    override fun say() {
        //super.say()
        name = "black"
        println("$name say: meowww")
    }
    override fun run(speed: Int) {
        //todo
    }
}

interface Event{
    fun run(speed: Int)
}