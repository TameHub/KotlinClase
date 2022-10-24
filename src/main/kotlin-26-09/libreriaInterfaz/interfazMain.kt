package libreriaInterfaz
class puntoPlano(override var x: Int, override var y: Int):interfazPunto{
    override fun imprimir() {
        println("COORDENADAS: "+x+" "+y)
    }
}
class punto3D(override var x: Int, override var y: Int,var z:Int):interfazPunto{
    override fun imprimir() {
        println("COORDENADAS: "+x+" "+y+" "+z)
    }
}
class alumno(override var tipoPersona: String, var nombre:String, var apellido:String):interfazPersona{
    override fun imprimirDatos() {
        println("Nombre: "+nombre+"\nApellido: "+apellido)
    }

    override fun saludar() {
        println("Hola soy un alumno")
    }

    override fun tipoPersona(): String {
        return super.tipoPersona()
    }

}
class empleado(override var tipoPersona: String,var nombre:String, var apellido:String, var sueldo:Int):interfazPersona{
    override fun imprimirDatos() {
        println("Nombre: "+nombre+"\nApellido: "+apellido+"\nSueldo: "+sueldo)
    }

    override fun saludar() {
        println("Hola soy un empleado")
    }
    override fun tipoPersona(): String {
        return super.tipoPersona()
    }
}
fun main(){
    var punto1=puntoPlano(2,5)
    var punto2=punto3D(2,5,74)
    punto1.imprimir()
    punto2.imprimir()
    println("_________________________________")
    var persona1=alumno("alumno","Angel","Ange")
    var persona2=empleado("empleado","flack","Hon",3000)
    persona1.imprimirDatos()
    persona2.imprimirDatos()
    persona1.saludar()
    persona2.saludar()
    println(persona1.tipoPersona())
    println(persona2.tipoPersona())
}