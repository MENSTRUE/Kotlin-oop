package database

//class rute { //propertis
//    var terpendek : String = ""
//    var menengah : String = ""
//    var terpanjang : String = ""

// ==> jika var harus diketahui !!!

class rute (var terpendek: String = "", var menengah : String = "", var terpanjang : String = ""){

    fun rute_function(program: String){      //function
        println("untuk $program, memiliki rute $terpendek")
    }

    fun perintah(){     // function
        println("larilah !")
    }

}