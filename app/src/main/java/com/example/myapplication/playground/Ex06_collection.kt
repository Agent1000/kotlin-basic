package com.example.myapplication.playground

class Ex06_collection {
}

fun main(){
    //Dynamic size (Mutable)
    val list1 = mutableListOf("111",123,true)
    val list2 = mutableListOf<Any>("111",123,true)
    val list3 = mutableListOf<Int>(124,123,5324)
    val list4 : MutableList<Int> = mutableListOf(124,123,5324)
    val list5 = mutableListOf<Any>()
    val list6 = mutableListOf<Int>()
    val list7 : MutableList <Int> = mutableListOf()

    list2.add("iBlur")
    for (item in list2){
        println("$item")

        //Fixed size (ImMutable) read-only
        val list8 = listOf("111",123,true)//not add
        val list9 = listOf<Any>("111",123,true)
        val list10 = listOf<Int>(124,123,5324)
        val list11 : List<Int> = listOf(124,123,5324)
        val list12 = listOf<Any>()
        val list13 = listOf<Int>()
        val list14 : List<Int> = listOf()

        //extension
        val listExtension = mutableListOf<Int>(123,4124,5453)
        println("sum: ${listExtension.sum()}")
        println("sumby: ${listExtension.sumBy { item -> item }}")
        println("in 1234: ${1234 in listExtension}")//search
        println("in 123: ${123 in listExtension}")//search
        println("all > 100: ${listExtension.all { item -> item > 100 }}")
        println("any >= 100: ${listExtension.any { item -> item >= 5000 }}")
        println("none = 111: ${listExtension.none { item -> item == 1111 }}")
        println("none = 123: ${listExtension.none { item -> item == 123 }}")

    }

}