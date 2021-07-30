package com.example.myapplication.playground

fun main() {
    normalFunction()
    argumentFunction(45,57)
    println(returnFunction())
    println(returnFunction2())
    println(returnFunction3(77,88))

    OptionalFunction(25)
    OptionalFunction(54,8)

    //lambda Expression
    val lambda1: (Int,Int) -> Int = {x1,x2 ->
        x1+x2
    }
    val lambda2 = {x1:Int,x2:Int-> x1+x2
    }
}



fun normalFunction(){
    println("DIck")

}
fun argumentFunction(x1:Int,x2:Int){
    println("sum : ${x1+x2}")
}

fun returnFunction(): String{
    return "iBlurIBlur"
}

fun returnFunction2() = "iBlurIBlur"

fun returnFunction3(x1 : Int,x2:Int) = x1+x2

fun OptionalFunction(x1 : Int,x2: Int = 0){
    println("sum : ${x1+x2}")
}
