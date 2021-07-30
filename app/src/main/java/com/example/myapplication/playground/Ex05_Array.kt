package com.example.myapplication.playground

fun main(){
    val array1 = arrayOf(1234,"1Blur",true) // เป็นอะไรก็ได้
    val array2 = arrayOf<Any>(1234,"1Blur",true) // <>สำหรับกำหนด ประเภทของ array
    val array3 = arrayOf<Int>(1234,444,555)

    val array4:IntArray = intArrayOf(123,456,789) // รูปอื่นๆ ของ array
    val array5 = intArrayOf(123,456,789)

    array2[0]="cat"
    array2.set(2,1235)

    println(array2[0])
    println(array2.get(2))

    //แสดงผล ใน array มักใช้ลูปเสมอ นี่คือ การวิธีการครับ  VVV
    for (item in array1){
        println("[for] array1 $item")
    }
    array2.forEach{ item ->
        println("[for] array2 $item ")
    }
    for(index in array1.indices) {
        println("[for > index] array1:${array1[index]}")
    }
    for (index in 0 until array1.size){
        println("[for > index] array1:${array1[index]}")
    }
    for((index,item)in array1.withIndex()){
        println("[for > index] array1 $item [$index]")
    }
    array1.forEachIndexed(){index,item->
        println("[for > index] array1: $item [$index]")
    }




//without inializing
    val array6 = arrayOfNulls<Any>(10)
    array6[0]="cat"
    array6[2]=1234
    array6.forEach { item->
        println("[forEach] array6: $item")
    }
    val array7 = arrayOfNulls<Int>(10)
    array7[0]=9999
    array7[2]=1234
    array7.forEach { item->
        println("[forEach] array7: $item")
    }
    val array8 = Array(10){index->
        //todo
        //todo
        if (index%2==0){
            "iBulr"
        }else{
            index * 2
        }
    }
    array8.forEach { item->
        println("[forEach] array8 : $item")
    }
    val array9 = Array <Int> (5){index ->
        //todo
        //todo
        if (index%2==0){
            index+index
        }else{
            index * 2
        }
    }
    //extension
    val arrayExtension = arrayOf<Int>(123,4124,5453)
    println("sum:${arrayExtension.sum()}")
    println("sumby:${arrayExtension.sumBy {item->item}}")
    println("in 1234 :${1234 in arrayExtension}")
    println("in 123:${123 in arrayExtension}")
    println("all > 100 :${arrayExtension.all{ item->item > 100}}")
    println("any >= 100 :${arrayExtension.any{ item->item >= 5000}}")
    println("none = 111 :${arrayExtension.none{ item->item > 1111}}")
    println("none = 123 :${arrayExtension.none{ item->item > 123}}")
}