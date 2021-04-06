package com.example.firstapplication

import android.os.Build
import java.util.*

fun main(args: Array<String>) {

    val read = Scanner(System.`in`)
    val year = read.nextInt()
    var leap = false
    if (year % 4 == 0)
    {
        if (year % 100 == 0)
        {
            leap = year % 400 == 0
        }
        else
            leap = true
        }
    else
        leap = false
     println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}
