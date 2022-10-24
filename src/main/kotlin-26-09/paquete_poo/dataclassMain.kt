package paquete_poo
fun main (){

    fun crearCoche (){
        val coche = carrito("cocheEpico",2,150,6)
        println("Los datos del coche son : ${coche.toString()}")
    }
    crearCoche()

    val tutor1 = tutor(123,"Contrato","Nombre1","05-34-42")
    println("Los datos del tutor1 son "+tutor1)
    println("___________________________________________________________________________")

    fun dataclassArticulo(){
        var articulo1 = articulo(32,"asiokj",5.23f)
        var articulo2 = articulo(32222,"AAAAAAAAAAAAAA",5.33f)
        var articulo3 = articulo1.copy(precio = 4.32f, descripcion = "NYANYNANYANAYN")
        var articulo4 = articulo1.copy(precio = 44.90f)
        var copiaArticulo3 = articulo3
        println(articulo1)
        println(articulo3)
        if (articulo3.equals(copiaArticulo3)){
            println("EL ARTICULO 3 Y LA COPIA SON IGUALES")
        }

    }
    dataclassArticulo()

    println(miSeat.descripcionCoche())

    var persona1 = persona("nombre",280)
    persona1.imprimir()

    var triangulo1 = triangulo()
    triangulo1.solicitar()
    triangulo1.ladoMayor()
    triangulo1.igualarLados()
    triangulo1.ladoMayor()
}




