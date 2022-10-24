package paquete_poo

import java.time.LocalDate

data class carrito (var nombre:String, var puertas:Int, var velocidad:Int, var asientos:Int){
    var potenciaMax:Int=300
}

data class profesor (var nip:Int, var contrato:String, var nombre:String, var nacimiento:String)
data class tutor (var nip:Int, var contrato:String, var nombre:String, var nacimiento:String){
    init {
       // var nacimiento: LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yy"))
    }
    var salario:Float?=0f
        set(value){
            if (value!=null){
                if (value < 0) field = 0f else field=value
            }else field = 0f
        }

}

data class articulo(var codigo:Int, var descripcion:String, var precio:Float)

class empleado (_nombre: String){
    var nombre:String = _nombre
        set(value){field = "gitan"}
        get() {return "("+field+")"}
    var comprobar:String = nombre+" P"
}

object miSeat {

    var modelo:String = "Leon"
    var puertas:Int = 5
    var velocidad:Int? = 200
        set(value) {
            if (value != null) {
                if (value < 0) field = 0 else field = value
            } else {
                field = 0
            }
        }
        get(){return field?:0}

    var asientos:Int= 5
    init {
        this.modelo.uppercase()
        velocidad = velocidad?:0}

    fun cambiarVelocidad() = this.velocidad
    fun detener() { this.velocidad = 0}
    fun descripcionCoche():String = "EL $modelo tiene $puertas puertas con $asientos asientos y llega a los $velocidad por hora"

    }

