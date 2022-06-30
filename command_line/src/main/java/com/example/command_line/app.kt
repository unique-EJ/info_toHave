package com.example.command_line

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
    for (i in 1..4) {
        println("            |")
    }
}

fun main() {
    ui()
}