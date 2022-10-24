import paquete_poo.*
import pkMatemeticas.*

fun main(args: Array<String>) {
    println("Hola soy el konlin!")

    fun obtenerDia(dia:Int){
        when (dia){
            1->print("Lunes")
            2->print("Martes")
            3->print("Miercoles")
            4->print("Jueves")
            5->print("Viernes")
            6->print("Sabado")
            7 -> print("Dominmo")
            else -> print("No hay dia")

        }
    }

    println(obtenerDia(4))


println ("SUMA -> "+ suma(4,1))
    println("Program arguments: ${args.joinToString()}")


    val seat1 = Coche("NombreCoche",4,12,4)
    seat1.cambioVelocidad(-6)
    println(seat1.velocidad)
    seat1.cambioVelocidad(200)
    seat1.parar()
    println(seat1.velocidad)
    seat1.cambioVelocidad(3)
    println(seat1.velocidad)
    println(seat1.descripcionCoche())
    println(seat1.nombreModelo)


    val con = empleado("fernando")
    println(con.comprobar)

}



