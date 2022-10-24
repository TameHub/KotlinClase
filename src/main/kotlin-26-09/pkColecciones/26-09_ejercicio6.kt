fun main() {

    fun sueldo(sueldo:Int):String{

        var respuesta:String="A"

        if (sueldo<3000){
            respuesta="Sueldo menor a 3000"
        }else{
            respuesta="Sueldo mayor a 3000 debe pagar impuestos"
        }

        return respuesta
    }

    println(sueldo(4000))
}