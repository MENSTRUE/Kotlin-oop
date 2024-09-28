package app_lari

import database.program

fun main() {

    val program1 = program("lari marathon", "pagi & sore", "senin,17 agustus 2027", "jum'at, 21 agustus 2027")
    val program2 = program("jalan santai", "pagi", "senin,17 agustus 2027", "jum'at, 21 agustus 2027")


    println(program1.program_name)
    println(program2.time)
}