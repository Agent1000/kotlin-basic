package com.example.myapplication.playground

fun main(){
    var cast1: Any= "iBlur"
    //val cast2= cast1 as String
    //val cast2 = cast1 as Int
    //print(cast2.length)
    if(cast1 is String){
        //smart cast
        println(cast1.length)
    }
    if(cast1!is String){
        //smart cast
        println("cast1 not string")
    }
    // if(cast1 is Int){
    //smart cast
    //    print(cast1)
    // }else{
    //     null
    // }
    val cast2 = cast1 as? Int
    //print(cast2)
}