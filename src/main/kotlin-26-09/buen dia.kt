fun main(args: Array<String>) {

    fun obtenerDia(dia:Int){
        when (dia){
            1 -> print("Lunes")
            2 -> print("Martes")
            3 -> print("Miercoles")
            4 -> print("Jueves")
            5 -> print("Viernes")
            6 -> print("Sabado")
            7 -> print("Dominmo")
            else -> print("No hay dia")

        }


    }
    println(obtenerDia(5))

}