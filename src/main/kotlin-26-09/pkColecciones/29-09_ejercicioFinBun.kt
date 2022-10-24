fun main() {

    fun fizzBuzz():String{

        var trash:Int?
        println("INTRODUZCA NUMERO")
        trash = readLine()?.toIntOrNull()
        val numero:Int = trash ?:0
        var respuesta:String=""


        if (numero%5 == 0 && numero%3 == 0){
            respuesta="FizzBuzz"
        }else if (numero%5 == 0){
            respuesta="Buzzzzzzzzzzzzzzzz"}
        else if (numero%3 == 0){
            respuesta="Fizz"}


            else{
            respuesta="El numero no es divisible entre 3, 5 ni 15"
        }
        return respuesta


    }
    println(fizzBuzz())
}