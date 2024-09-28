/*

==> Saat kita membuat Object, maka kita seperti memanggil sebuah function
==> Di dalam class Kotlin, kita bisa membuat Constructors, Constructors mirip seperti function yang akan dipanggil saat pertama kali Object dibuat.
==> Mirip seperti di Function, kita bisa memberi parameter pada Constructors

contoh :
class lomba(paramHari: String, paramTema: String, paramTanggal: Int, paramBulan: Int, paramTahun: Int){
   var hari : String = paramHari
   var tema : String = paramTema
   var tanggal : Int = paramTanggal
   var bulan : Int = paramBulan
   var tahun : Int = paramTahun
}


yang terdapat pada main :
    val lomba1 = lomba("senin", "lari pagi sehat", 10, 5, 2024) // ini constractornya
    println (terserah apa aja)
 */