package com.example.myapplication.playground.oop

fun main(){
    // InjectorUtils()
    println(InjectorUtils.name)
    println(InjectorUtils.getFoo1())
    println(InjectorUtils == InjectorUtils)
    println()
    println(MyClass() == MyClass())
    println(MyClass.create() == MyClass.create())
    MyClass.fingerSnap()

    val obj1 = object {
        var x1 = 9
        var x2 = 11

        fun sum() = x1 + x2
    }

    println(obj1.x1)
    println(obj1.sum())

}

// singleton
// static
object InjectorUtils {
    var name = "iBlurBlur"
        private set

    fun getFoo1() = 1234
}
class MyClass{
    var name = "iBlurBlur"

    fun getFoo1() = 1234

    companion object Factory{
        // static
        // singleton
        private var INSTANCE: MyClass? = null

        fun create(): MyClass {
            if(INSTANCE == null){
                INSTANCE = MyClass()
            }
            return INSTANCE!!
        }

        fun fingerSnap(){
            println("OMG")
        }
    }
}