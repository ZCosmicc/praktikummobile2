import com.sun.jdi.IntegerValue

fun main() {
    print("Nilai x = ")
    val x = Integer.valueOf(readLine())

    fun rumus(x : Int): Int
    {
        val hasil = 2 * (x * x) + (5 * x) - 8
        return hasil
    }
    println (rumus(x))
}
