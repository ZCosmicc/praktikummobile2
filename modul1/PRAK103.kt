fun main(args: Array<String>) {
    print("Input bilangan = ")
    var input = readLine()!!.toInt()
    val y = input
    var z = 5

    for (i in 1..z) {
        if(input % 2 == 0 || input % 3 == 0) {
            print(input)
            print(" ")
            input += y
        } else {
            input += y
            z += 1
        }
    }
}