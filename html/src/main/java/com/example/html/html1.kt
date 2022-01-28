package com.example.html

import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.stream.appendHTML

fun main() {
    /* https://kotlinlang.org/docs/typesafe-html-dsl.html
    * https://github.com/Kotlin/kotlinx.html/wiki
    * */
    // "println" output:
    System.out.appendHTML().html {
        body {
            h1 { +"123!" }
            +"(HTML DSL)"
        }
    }
}