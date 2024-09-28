package app_lari

import database.data_personal
import database.rute
import database.speed
import database.waktu_penyelesaian

fun main() {
    val nisa = data_personal()   // object yang diambil
    nisa.nama = "nisa"
    nisa.region = "malasyia"
    nisa.email = "nisaiyah@yahoo.co.id"
    nisa.birthday_date = "6 november 2004"

    val rute_nisa = rute()
    rute_nisa.terpendek = "1 km"
    rute_nisa.menengah = "4.5 km"
    rute_nisa.terpanjang = "10 km"

    val speed_nisa = speed()
    speed_nisa.terlambat = "5 km/jam"
    speed_nisa.menengah = "10 km/jam"
    speed_nisa.tercepat = "30 km/jam"

    val waktu_penyelasaian_nisa = waktu_penyelesaian()
    waktu_penyelasaian_nisa.tercepat = "2 jam"
    waktu_penyelasaian_nisa.menengah = "3 jam"
    waktu_penyelasaian_nisa.terlambat = "4 jam"

    println(nisa.nama)
}


