fun main() {
    val listaSemana = listOf<String>("Lunes","Mar","Mie","Jueves","es","So","Domingo")
    val listaFinde = listOf<String>("Viernes","Sabado","Domingo")
    val tamanoLista:Int = listaSemana.size
    var i:Int=0
    var m:Int=0
    fun ejercicio7():String{
        var dia:String=""
        for (i in listaSemana.indices){
            dia=listaSemana.elementAt(i)
            println(dia)
        }
        println("EJERCICIO A---------------------------------")
        var posicion:Int = 0
        for (i in listaSemana.indices){
            if (listaSemana.contains("Martes")){
               posicion=listaSemana.indexOf("Martes")
            }
        }
        println("EL DIA MARTES SE ENCUENTRA EN LA POSICION "+posicion)
        println("EJERCICIO B---------------------------------")
        println("LA PRIMERA POSICION DE LA LISTA CONTIENE: "+listaSemana.get(0))
        println("EJERCICIO C---------------------------------")
        println("LA ULTIMA POSICION DE LA LISTA CONTIENE: "+listaSemana.elementAt(listaSemana.lastIndex))
        println("EJERCICIO D---------------------------------")

        var estar="Mim"
        if (listaSemana.contains("Jueves")){
            estar="SI"
        }else{estar="NO"}

        for (i in listaFinde.indices){
            println(listaFinde.elementAt(i))
        }
        println("---------------------------------")

        var listaCopia1 = mutableListOf<String>()
        var diaTemp:String = ""
        var t:Int = 0
        for (i in listaSemana.indices){
            diaTemp = listaSemana.elementAt(i)
            if (diaTemp.length>=4){
                listaCopia1.add(diaTemp)
            }
        for (i in listaCopia1.indices){
            println(listaCopia1.elementAt(i))
            println("***")
        }
        println("---------------------------------")
        var listaCopia2 = mutableListOf<String>()
        var palabro:String = ""
        for (i in listaSemana){
            palabro = i



        }

        }

        return ("EL VALOR DE LA PRIMERA POSICION ES "+listaSemana.elementAt(0)+
                "\nEL TAMAÑO DE LA LISTA ES DE "+((listaSemana.lastIndex)+1)+" Objetos"+
                "\nLA POSICION DE (Lunes) ES LA "+listaSemana.indexOf("Lunes")+
                "\nEL VALOR (Jueves) "+estar+" ESTA"+"\n---------------------------------"
                )


    }
    println(ejercicio7())


}
