fun main(args: Array<String>) {

    //Escribir un programa que lea por teclado 4 valores numericos enteros e informar su suma y su promedio, el programa principal llama a una funcion que devuelve el promedio
    fun mates2 ():String{

        var trash:Int?
        println("INTRODUZCA NUMERO 1")
        trash = readLine()?.toIntOrNull()
        val num1 = trash ?:0
        println("INTRODUZCA NUMERO 2")
        trash = readLine()?.toIntOrNull()
        val num2 = trash ?:0
        println("INTRODUZCA NUMERO 3")
        trash = readLine()?.toIntOrNull()
        val num3 = trash ?:0
        println("INTRODUZCA NUMERO 4")
        trash = readLine()?.toIntOrNull()
        val num4 = trash ?:0

        fun promedio ():String{

            return ("El promedio de los numeros es "+((num1+num2+num3+num4)/4))

        }
        println(promedio())
        val valorTotal = num1+num2+num3+num4
        return ("El valor total de la suma de los 4 numeros es igual a "+valorTotal)

    }
    println(mates2())


}