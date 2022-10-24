fun main(args: Array<String>){

    //Se debe desarrollar un programa que pida el ingreso del precio de un articulo y la cantidad que lleva el cliente.Mostrar lo que debe abonar el comprador

    fun precio():Float{

        var trash: Float?
        println("INTRODUZCA EL PRECIO")
        trash = readLine()?.toFloatOrNull()
        val precio = trash ?:0f
        println("INTRODUZCA CANTIDAD")
        trash = readLine()?.toFloatOrNull()
        val cantidad = trash ?:0f

        return (precio*cantidad)

    }

    println("El precio total es de "+precio())

}