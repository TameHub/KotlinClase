fun main(args: Array<String>){

    fun ejercicio1(): Int {
        var trash: Int?
        println("INTRODUCE NUMERO")
        trash = readLine()?.toIntOrNull()
        val valor1: Int = trash ?:0
        trash = readLine()?.toIntOrNull()
        val valor2: Int = trash ?:0
        val resultado: Int = valor1+valor2
        println("la suma es "+resultado)
        return resultado


    }

    println("la suma es "+ejercicio1())



}