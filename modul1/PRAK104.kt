data class Olahraga(val nama: String, val alat: String, var JmlPemain: Int) {

}

fun main(args: Array<String>) {
    val olhrg = Olahraga("Sepak Bola", "Bola", 13)
    val olhrg2 = Olahraga("Voli", "Bola Voli", 6)
    val olhrg3 = Olahraga("Badminton", "Raket", 2)
    println("Nama Olahraga: ${olhrg.nama}")
    println("Alat yang digunakan: ${olhrg.alat}")
    println("Nama Olahraga: ${olhrg2.nama}")
    println("Alat yang digunakan: ${olhrg2.alat}")
    println("Nama Olahraga: ${olhrg3.nama}")
    println("Alat yang digunakan: ${olhrg3.alat}")
}

