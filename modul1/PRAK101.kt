fun main (args : Array<String>) {
    print("Waktu Sekarang: ")
    val waktu = readLine()!!
    print("Nama Anda: ")
    var nama = readLine()!!
    print("Umur Anda: ")
    var umur = readLine()!!.toInt()
    val suhu = (35..37).random().toDouble()
    println("Suhu Tubuh Anda: $suhu")

    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat")
    print("Celcius.")
}