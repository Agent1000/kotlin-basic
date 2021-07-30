package com.example.myapplication.playground

class Ex01Variable {
}

//complie time
const val CONST_1 =1150
const val CONST_2 : Int = 1150

fun main() {
//Mutable(Implicit)
    var var1= "iBlurBlur"
    var var2= 1234
    var var3= true
    var var4= 12.55f // F ก็ได้นะ
    var var5= 12.55
    var1="cat"

// Mutable(Explicit)
    var var6 : String = "iBlurBlur"
    var var7 : Int = 1234
    var var8 : Boolean = true
    var var9 : Float = 12.55f // F นี้ก็ได้นะ
    var var10 : Double = 12.55
    var6 = "dog"

    println("result :" +var1 + "," + var6)
    //String template
    println("result : $var1 , $var6")
    println("iBlurBlur "
            + "cat lover "
            + "<3")
    println("""
  iBlurBlur
  cat lover
       <3
       """)
    var money = 100_000_000
    println(money)

    //Immutable (final)(runtime)
    val val1 = "iBlurBlur" // Implicit
    //val1 = cat
    val val2 : String = "iBlurBlur" //Explicit
    //val2 = cat
    val val3 : String
    val3 = "iBlurBlur"

    var any1 :Any = 1234 // Any คือ เป็นอะไรก็ได้
    any1="iBlurBlur"
    any1=true
    // val ใช้กับ ค่า ที่เปลี่ยนไม่ได้ var จะเปลียนได้

    println(CONST_1)
    println(CONST_2)

}