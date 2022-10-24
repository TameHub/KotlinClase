fun main(args: Array<String>) {

    //8. Crear una lista mutable con las edades de varias personas. Las edades se
    //introducen por teclado, y solicite cuanta edades va a introducir o almacenar.
    fun ejercicio8(){
        var trash:Int?
        var numeroEdades:Int=0
        var edad:Int=0
        var cadenaEdad:String=""
        var i:Int=0
        var listaEdades = mutableListOf<String>("")
        println("INTRODUZCA EL NUMERO DE EDADES A INTRODUCIR")
        trash = readLine()?.toIntOrNull()
        numeroEdades=trash ?:0

        while (i<=numeroEdades){
            println("INTRODUZCA EDAD NUMERO "+i)
            trash= readLine()?.toIntOrNull()
            edad=trash ?:0
            cadenaEdad=""+edad
            listaEdades.add(cadenaEdad)
            i++
        }

    }

    fun ejercicio7():String{
        /*
        7. Declare una lista inmutable llamada "listaDiasSemana", donde almacena los días
    de la semana en abreviatura
    a) imprima la lista
    b) imprima la posición del día "Martes" dentro de la lista
    c) imprima el valor la primera posición de la lista
    d) imprima el valor la última posición de la lista
    e) devuelva el valor de la primera posición
    f) devuelva el tamaño de la lista
    g) devuelva la posición donde se encuentre el valor "Lun"
    h) verificar si el valor "jue" esta dentro de la lista
    i) declare una lista llamada listaFinde, donde sus valores sean "Vie", "Sab" y "Dom"
    j) imprima la listaFinde
    k) declare una "ListaCopia1" a partir de listaDiasSemana donde almacene solamente
    los valores que tengan mas de 4 letras
    l) declare una "ListaCopia1" a partir de listaDiasSemana donde almacene solamente
    los valores que tengan o contenga la letra "M"
    m) imprima las listas "ListaCopia1" y "listaCopia2"
    --------------------------------------------------------------------------------

         */
        val listaSemana= listOf<String>("Lun","Mar","Mier","Jue","Vier","Sab","Dom")

        //a)
        println(listaSemana)

        //b)
        println("El valor de la posicion Martes dentro de la lista es: ${listaSemana.indexOf("Mar")}")

        //c)
        println("El valor de la primera posicion de la lista es: ${listaSemana.get(0)}")

        //d)
        println("El valor de la ultima posicion de la lista es: ${listaSemana.get(6)}")

        //h
        if(listaSemana.contains("Jue"))
            println("La lista contiene el valor jue")
        else println("La lista no contiene el valor else")

        //i
        val listafinde= listOf<String>("Vie","Sab","Dom")

        //j
        println(listafinde)

        var diatemp:String=""
        var listaCopia1 = mutableListOf<String>()

        //k
        for(i in listaSemana.indices)
            diatemp=listaSemana.elementAt(i)
        if (diatemp.length<=4){
            listaCopia1.add(diatemp)
        }
        println(listaCopia1)
        //e) f) g)

        return("El valor de la primera posicion es: ${listaSemana.elementAt(0)} \n" +
                "El tamaño de la lista es: ${listaSemana.size} \n" +
                "La posicion donde se encuentra el valor lunes es: ${listaSemana.indexOf("Lun")}"
                )


    }
    println(ejercicio7())
}