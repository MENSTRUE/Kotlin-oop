package app_lari

import database.lomba

fun main() {

    val lomba1 = lomba("senin", "lari pagi sehat", 10, 5, 2024) // ini constractornya
    val lomba2 = lomba("selasa", "lari sore", 11, 5)
    val lomba3 = lomba ("rabu", "lari biasa", 12)

    println(lomba1.hari)
    println(lomba1.tema)
    println(lomba1.tanggal)
    println(lomba1.bulan)
    println(lomba1.tahun)

    println(lomba2.hari)
    println(lomba3.hari)

}