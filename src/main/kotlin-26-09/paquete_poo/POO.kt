package paquete_poo

class Coche(var nombreModelo:String, val numPuertas:Int, var velocidad:Int, val numAsientos:Int ){

    fun cambioVelocidad(nuevaVelociad:Int){
        velocidad = nuevaVelociad
    }

    fun parar(){
        velocidad = 0
    }

    fun descripcionCoche():String{
        return "AAAAAAAAAAAAAAAAAAA"
    }

    init {
        nombreModelo=nombreModelo.toUpperCase()
        if (velocidad<0){velocidad=0}
        if (velocidad>300){velocidad=0}
    }

}

