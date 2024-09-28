package app_lari

import database.notification

fun main() {

    val notif = notification()
    notif.tulisan("saiful")  //langsung memanggil datanya
    notif.tulisan("zah", "lari sejauh 100 km")   //tidak ada yang sama 1 = 1


}