import javax.print.DocFlavor.STRING

fun main(){
    fun comprobarnum(num1:Int, num2:Int):String {

        var respuesta:String =""
        if (num1>num2){
            respuesta="El num 1 es mayor al 2"

        }
        if (num2>num1){
            respuesta="El num 2 es mayor al 1"

        }

        return respuesta
}
    println(comprobarnum(4,1))
}