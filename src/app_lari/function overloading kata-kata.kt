package app_lari

import database.kata_kata_hari_ini
import database.kata_kata_pelari

fun main() {
val kata= kata_kata_pelari("apa aja","yo", "aman")

    println(kata.pendahuluan)

    kata_kata_hari_ini("yanto")    //ngga wajib manggil pake . depan

}