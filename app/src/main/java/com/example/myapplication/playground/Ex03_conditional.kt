package com.example.myapplication.playground

fun main() {
    var expresison1 = if (true){
        1234
    }else{9999}

    var expresison2 = if(true) 1234 else 9999

    //switch case
    val name = "iBlurBlur"
    when(name){
        "iBlurBlur" ->{//todo
        }
        "cat" -> {
            //todo
        }
        "red","green", "blue" ->{
            //todo
        }
        else -> {
            println("defaut case !!")
        }
    }

    val  score = 80
    if (score>=100){
        //todo
    }else if(score >=80){
        //todo
    }else if(score >=50) {
        //todo
    }else{
        //todo
    }
    when{
        score>=100->{
            //todo
        }
        score>=80->{
            //todo
        }
        score>=50->{
            //todo
        }
        else ->{
            //todo
        }
    }
    when(score) {
        in 0..10 -> {
            //todo
        }
        in 0..50 -> {
            //todo
        }
        55,60 -> {
            //todo
        }
        else -> {
            //todo
        }
    }
    val expression3 = when("name"){
        "name" ->"iBlurBlur"
        "age"->30
        else->true
    }

}