package com.example.myapplication.playground.oop

fun main(){
    val  obj1 = PrimaryClass("aa",123)
    println("obj1.name : ${obj1.name}")
    obj1.display()
    println()
    val  obj2 = Secondray()
    println("obj2.name : ${obj2.name}")
    obj2.display()

    val  obj4 = PSClass(80,"aa")
    println("obl4.score: ${obj4.name},${obj4.score}")
    println()
    val  obj5 = PSClass(80)
    println("obl5.score: ${obj5.name},${obj5.score}")
    println()

    //show true : compare instant check data
    val  obj6 = DataClass("aa",123)
    println("xxxx : ${obj6 .toString()}")
    val  obj7 = DataClass("aa",123)
    println("xxxx : ${obj6 == obj7}")
    val  obj8 = PrimaryClass("aa",123)
    println("xxxx : ${obj8 .toString()}")

    val (name,age)=DataClass("aa",123)
    println("name: $name , age: $age")
}
class PrimaryClass (val name: String="bb",val age: Int = 99) {
    init {
        println("primary init")
    }
    init {
        println("age : ${age}")
    }
    fun display(){
        val result = "name: $name, age: $age"
        println("Primary: $result")
    }
}
class Secondray{
    var name: String  =""
    var age: Int = 0
    constructor(){
        this.name=""
        this.age=123
    }
    constructor(name: String){
        this.name=name
        this.age=123
    }
    constructor(age: Int){
        this.name=""
        this.age=age
    }
    constructor(name: String,age: Int){
        this.name=name
        this.age=age
    }
    init {
        println("Secondray init")
    }
    init {
        println("age : $age")
    }
    fun display(){
        val result = "name: $name, age: $age"
        println("Secondray: $result")
    }
}

class PSClass(val score:Int,val name: String){
    constructor(score: Int):this(name = "xx",score = score)
}

data class DataClass(var name: String, var age: Int){
    constructor(age: Int):this(name = "xx", age = age){

    }
}