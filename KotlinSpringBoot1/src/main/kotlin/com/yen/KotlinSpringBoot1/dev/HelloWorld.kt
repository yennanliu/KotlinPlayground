package com.yen.KotlinSpringBoot1.dev

// https://www.runoob.com/kotlin/kotlin-tutorial.html


class HelloWorld {
}

fun main(args: Array<String>) {
    myMethod(); // 包级可见的函数，接受一个字符串数组作为参数
    println(add(1,2));
    vars(1,2,3,4,5);
    println("Hello World!");         // 分号可以省略
}

fun myMethod() {    // 包级可见的函数，接受一个字符串数组作为参数
    println("my method run !!!")         // 分号可以省略
}

fun add(a: Int, b: Int): Int{
    return a + b;
}

fun vars(vararg v: Int){
    for(vt in v){
        println(vt);
    }
}