fun main(args: Array<String>) {

    //Escribir un programa en el cual se ingresen cuatro numeros enteros calcular e informar la suma de los 2 primeros y el producto del 3 y el 4

    fun mates():String{

        var trash:Int?
        println("Introduce num 1")
        trash = readLine()?.toIntOrNull()
        val num1:Int = trash ?:0
        println("Introduce num 2")
        trash = readLine()?.toIntOrNull()
        val num2:Int = trash ?:0
        println("Introduce num 3")
        trash = readLine()?.toIntOrNull()
        val num3:Int = trash ?:0
        println("Introduce num 4")
        trash = readLine()?.toIntOrNull()
        val num4:Int = trash ?:0



        return("La suma de los dos primeros numeros es de "+(num1+num2)+" y el producto del tercero y el cuarto es de "+(num3*num4))
    }

    println(mates())



}