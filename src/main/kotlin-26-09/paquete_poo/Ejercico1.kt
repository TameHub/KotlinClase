package paquete_poo

 class persona (var nombre:String, var edad:Int){

     init {
         if (edad!=null){
             if (edad<0){
                 println("ERROR, NO SE PUEDEN INTRODUCIR VALORES NEGARIVOS")
             }
         }


     }

    fun imprimir(){
        if (edad<18){
            println("PERSONA MENOR DE EDAD")
        }else if (edad>=18 && edad<=29){
            println("PERSONA JOVENEDAD")
        }else{
            println("PERSONA MAYOR DE EDAD")}
    }

}

open class triangulo (){

    var lado1:Int=0
    var lado2:Int=0
    var lado3:Int=0
    var trash:Int?=0
    fun solicitar(){
        println("INTRODUZCA LADO 1")
        trash= readLine()?.toIntOrNull()
        lado1 = trash ?:0

        println("INTRODUZCA LADO 2")
        trash= readLine()?.toIntOrNull()
        lado2 = trash ?:0

        println("INTRODUZCA LADO 3")
        trash= readLine()?.toIntOrNull()
        lado3 = trash ?:0

        println("LOS DATOS SON "+lado1+" "+lado2+" "+lado3)

        }

    init {
        if (lado1<=0 || lado2 <=0 || lado3<=0){
            println("ERROR AL CREAR EL TRIANGULO, cambiando valores a 1")
            lado1=1
            lado2=1
            lado3=1
        }
    }

    fun igualarLados(){
       var ladoIgual:Int=0
        println("Introduzca el tamaño de los 3 lados")
        trash = readLine()?.toIntOrNull()
        ladoIgual = trash?:0

        lado1=ladoIgual
        lado2=ladoIgual
        lado3=ladoIgual

        println("LOS LADOS HAN SIDO IGUALADOS : LADO1: "+lado1+" LADO 2: "+lado2+" LADO3: "+lado3)

    }


    fun ladoMayor(){
        if (lado1>lado2 && lado1>lado3){println("El lado mayor es el 1")}
        if (lado1==lado2 && lado1>lado3){println("Los lados 1 y 2 son mayores")}
        if (lado2>lado1 && lado2>lado3){println("El lado mayor es el 2")}
        if (lado2==lado3 && lado2>lado1){println("Los lados 2 y 3 son mayores")}
        if (lado3>lado2 && lado3>lado1){println("El lado mayor es el 3")}
        if (lado1==lado3 && lado1>lado2){println("Los lados 1 y 3 son mayores")}
        if (lado1==lado2 && lado2==lado3){println("Todos los lados son iguales")}
    }

}


