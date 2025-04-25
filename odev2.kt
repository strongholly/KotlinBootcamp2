package com.example.kotlindersleri.Odev

fun main(){

    fun fahrenheit(derece : Int) : Double {

        return  derece*1.8+32


    }

    fun dikdortgen(kısakenar : Double , uzunkenar : Double) : Double {



        return 2*(kısakenar+uzunkenar)

    }


    fun faktoriyel(sayi : Int ) : Int {

        var sayi2 = 1

        for (i in 1..sayi) {

            sayi2 *= i


        }

        return sayi2

    }

    fun bulucu(harf : String) : Int {

        var sayac = 0

        for (i in harf) {

            if (i=='A' || i=='a') {

                sayac++
            }

        }
        return sayac

    }


     println( fahrenheit(32))
    println(dikdortgen(5.0,6.2))
    println(faktoriyel(5))
    print(bulucu("ABCDEAAAA"))

}