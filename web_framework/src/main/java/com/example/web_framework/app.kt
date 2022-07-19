package com.example.web_framework

import io.javalin.Javalin

/*
#======================================================#
|  _info_ to have, do, make with - app [command line]  |
|------------------------------------------------------|
| Home [h]   | App for **saving data/information to    |
| Open [o]   | your device** to have, do, make (things)|
| ...        | with - and to search for connections,   |
|            | links of things in that data.           |
|            |                                         |
|            |                                         |
|            |                                         |
|            |                                         |
|------------------------------------------------------|
| Search: ___                                          |
|------------------------------------------------------|
#======================================================#
*/

fun ui() {
    println("  _info_ to have, do, make with - app [command line]  ")
    println("------------------------------------------------------")
    println(" Home [h]   | App for **saving data/information to    ")
    println(" ...        | your device** to have, do, make (things)")
    println(" ...        | with - and to search for connections,   ")
    println("            | links of things in that data.           ")
    /*for (i in 1..4) {
        println("            |")
    }*/
}

fun main() {
    val app = Javalin.create().start(7070)
    //try {
    val path = java.nio.file.Paths.get("web_framework/") // * html file - Bootstrap...
    println(path.toAbsolutePath())
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/ , https://docs.oracle.com/javase/tutorial/essential/io/file.html
    // var reader = java.io.FileReader()
    //}
    app.get("/") { ctx -> ctx.result("Hello World") }// ctx.html(...) }
}