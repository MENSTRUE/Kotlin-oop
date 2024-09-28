package database

class lomba(paramHari: String, paramTema: String, paramTanggal: Int, paramBulan: Int, paramTahun: Int){ //parameternya

    init {
        println("lomba $paramTema di adakan")  // inializer block ( kode programnya jangan terlalu berat / sederhana )
    }

    constructor(paramHari: String, paramTema: String, paramTanggal: Int, paramBulan: Int) : this(paramHari, paramTema, paramTanggal, paramBulan, 2024 ){
        println("secondary constructor")
    }
    constructor(paramHari: String,paramTema: String, paramTanggal: Int) : this (paramHari, paramTema, paramTanggal, 5){ //untuk integer atau angka tidak boleh kosong
        println("secondary constructor 2")
    }

    var hari : String = paramHari
    var tema : String = paramTema
    var tanggal : Int = paramTanggal
    var bulan : Int = paramBulan
    var tahun : Int = paramTahun
}