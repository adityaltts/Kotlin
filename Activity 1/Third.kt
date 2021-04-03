package com.example.firstapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>)
{
   val sc= Scanner(System.`in`)
    println("enter amrks of three subjects")
    var a=sc.nextInt()
    var b=sc.nextInt()
    var c=sc.nextInt()
    var d=a+b+c
    var e=d/3
    println("Total marks of the student $d")
    println("Percentage of the student $e")
}
