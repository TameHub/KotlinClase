fun main(args: Array<String>){

    fun ejercicio2():Int{

        var trash: Int?
        println("INTRODUCE LA LONGITUD DEL LADO")
        trash = readLine()?.toIntOrNull()
        val lado = trash ?:0

        println("La longitud del lado es igual a "+lado)
        println("El area del cuadrado es de "+(lado*lado))

        return lado
    }
    println(ejercicio2())

}