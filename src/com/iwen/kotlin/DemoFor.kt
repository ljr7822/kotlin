package com.iwen.kotlin

/**
 * for循环: for 循环可以对任何提供迭代器（iterator）的对象进行遍历，这相当于像 C# 这样的语言中的 foreach 循环
 *
 * 有一个成员函数或者扩展函数 iterator()，它的返回类型
 * 有一个成员函数或者扩展函数 next()，
 * 有一个成员函数或者扩展函数 hasNext() 返回 Boolean
 *
 * @Author: iwen大大怪
 * @DateTime: 2020/6/28 22:18
 */
class DemoFor {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            forTest1()
            forTest2()
        }
    }
}

fun forTest1() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun forTest2(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}