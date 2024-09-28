package app_lari

import database.rute

fun main() {
    val rute1 = rute()              // contoh function
    rute1.terpendek = "10 km"
    rute1.menengah = "15 km"
    rute1.terpanjang = "40 km"

    rute1.rute_function("lari pagi")
    rute1.perintah()       // function (method)

}