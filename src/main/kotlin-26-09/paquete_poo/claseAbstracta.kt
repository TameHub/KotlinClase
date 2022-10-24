package paquete_poo

abstract class vehiculo(var modelo:String, var numBastidor:String, var peso:Float?, var color:String){
    //PROPIEDADES ABSTRACTAS
    public abstract var velocidadMaxima:Float
    //METODOS ABSTRACTOS
    abstract fun acelecar(valor:Int)
    abstract fun detener()
    //METODOS NO ABSTRACTOS DEFINIDOS
    open fun fichaVehiculo()= println("COCHE caracteristicas:\nModelo: "+modelo+"\n"+"Numero Bastidor: "+numBastidor+"\n"+"Peso: "+peso+"\nColor: "+color+"\nVelocidadMax:"+velocidadMaxima)
}

public class modeloSeat(_modelo:String,_numBastidor:String,_peso:Float?,_color: String):vehiculo(_modelo,_numBastidor,_peso,_color){
    override var velocidadMaxima: Float=10f
        set(value) {if (value<0){field=0f}else{field=value}}

    init {
        modelo =_modelo.uppercase()
        numBastidor =_numBastidor.uppercase()
        peso = _peso ?:0f
        color = _color.uppercase()
    }
    override fun detener() {
        TODO("Not yet implemented")
    }

    override fun acelecar(valor: Int) {
        TODO("Not yet implemented")
    }

    override fun fichaVehiculo() {
        println("AMOGNUS")
        super.fichaVehiculo()
    }
}

class A {
    var a1:Int=0
    var a2:Int=0
    fun Imprimir(){
        println("Hola")
    }
}