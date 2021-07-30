package com.example.myapplication.playground

fun main() {
    //var null: String = null
    var null2: String? = null
    """"
    if (null != null) {
        println(null2.length)
    }
    """"
    println(null2?.length)
    //program = null : program is death
    //println(null2!!.length)

    null2 = "iBlur"
    println(null2)?:"cat"

    //Elvis operator
    var null3 = null2 ?:"cat"
    """
       บรรทัดเมื่อกี้คือสิ่งนี้ 
        if(null2!=null){
            null3 = null2
        }else{
            null3 = "cat"
        }
    """
    null2?.let{
        //todo
    }
    if (null2 ==null){
        //todo
    }


}