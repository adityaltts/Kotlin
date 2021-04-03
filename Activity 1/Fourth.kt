package com.example.firstapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>)
{
println("Enter the quantity")
    val number1 = readLine()!!.toInt()
    println("Enter the unit  price of the sold item")
    val number2 = readLine()!!.toInt()
    val bill =  number1 * number2
    println("the calculated bill amount is $bill ")
    val discountedbill = (bill * 15)/100
    val last = bill-discountedbill

    val text ="""
        the bill you got 
        1. quantity= $number1
        2. unit price of the sold item is = $number2
        3. calculated bill without discount = $bill
        4. calculated bill with 15% discount = $discountedbill
         
         total money you have to pay $last  
    """
    println(text)
}
