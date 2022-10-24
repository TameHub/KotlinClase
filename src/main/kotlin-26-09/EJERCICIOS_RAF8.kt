fun main(args: Array<String>) {

    //8. Crear una lista mutable con las edades de varias personas. Las edades se
    //introducen por teclado, y solicite cuanta edades va a introducir o almacenar.
    fun ejercicio8() {
        var trash: Int?
        var numeroEdades: Int = 0
        var edad: Int = 0
        var cadenaEdad: String = ""
        var i: Int = 1
        var t: Int = 0
        var totalEdades:Float=0f
        var mayoresEdad:Int=0
        var cambio:Int=0
        var nuevaEdad:Int=0
        var listaEdades = mutableListOf<Int>()
        println("INTRODUZCA EL NUMERO DE EDADES A INTRODUCIR")
        trash = readLine()?.toIntOrNull()
        numeroEdades = trash ?: 0

        while (i <= numeroEdades) {
            println("INTRODUZCA EDAD NUMERO " + i)
            trash = readLine()?.toIntOrNull()
            edad = trash ?: 0
            totalEdades=totalEdades+edad
            if (edad>=18){mayoresEdad++}
            listaEdades.add(edad)
            i++
        }

        println(listaEdades)
        println("EL PROMEDIO DE EDADES ES DE :"+totalEdades/numeroEdades)
        println("HAY "+mayoresEdad+" MAYORES DE EDAD")

        println("INTRODUZCA LA EDAD QUE QUIERE CAMBIAR")
        trash = readLine()?.toIntOrNull()
        cambio = trash ?:0
        println("INTRODUZCA LA NUEVA EDAD")
        trash = readLine()?.toIntOrNull()
        nuevaEdad = trash?:0
        listaEdades[cambio-1]=nuevaEdad

        println(listaEdades)

        println("INTRODUZCA LA QUE QUIERE ELIMINAR")
        trash = readLine()?.toIntOrNull()
        cambio = trash ?:0

        listaEdades.removeAt(cambio-1)
        println(listaEdades)



    }
    println(ejercicio8())
}