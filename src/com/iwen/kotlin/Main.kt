package com.iwen.kotlin

/**
 * @Author: iwen大大怪
 * @DateTime: 2020/6/28 11:54
 */

fun main(){
    var add = sum(10,20)
    var add2 = sum2(20,50)
    println("hello word $add $add2")
}

fun sum(a: Int, b:Int):Int{
    return a + b
}

fun sum2(a:Int, b:Int) = a + b