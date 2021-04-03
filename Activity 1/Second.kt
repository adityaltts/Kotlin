package com.example.firstapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){
    val read = Scanner(System.`in`)
    var n = read.nextInt()
    circle()
    var ans = circle()
    var anss = circle()

    var side : Float? = ans.Circumference(n)

    println(ans.Circumference(n))
    println(anss.Area(n))

    square()
    var ansss = square()
    println(side?.let { ansss.Sarea(it) })


}

class circle {
    fun Circumference(n: Int): Float? {

        return 6.28f*n
    }

    fun Area(n: Int): Float? {
        return 3.14f*n*n
    }
}
class square{
    fun Sarea(side: Float): Float? {
        return side/4
    }
}
