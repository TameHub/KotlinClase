package paquete_poo


fun mensajeInicio():Int{

    println("BIENVENIDO A PIZZAHUT!")
    var continuar:Boolean=false
    var trash:Int?=0
    var eleccion:Int=0
    while (continuar==false){
        println("ELIJA UN TIPO DE PIZZA")
        println("1-Pizzas de la casa")
        println("2-Pizza de dos mitades combinadas")
        println("3-Pizza a tu modo")
        continuar=true
        trash= readLine()?.toIntOrNull()
        eleccion = trash ?:0
        when(eleccion){
            1 -> println("Pizzas de la casa Elegido")
            2 -> println("Pizzas de dos mitades Elegido")
            3 -> println("Pizzas a tu modo Elegido")
            else ->continuar=false
        }

    }

    return eleccion
}

fun eleccion(numero:Int){
    if (numero==1){
        println("_________________________")
        println("PIZZAS DE LA CASA")
        println("ELIJA LA PIZZA QUE QUIERE")
        println("1 PIZZA AMERICANA   :Salsa de tomate, mozzarella, extra de pepperoni, bacon y cebolla roja")
        println("2 PIZZA Barbacoa    :Salsa barbacoa, carne, cebolla roja y bacon, extra de queso")
        println("3 PIZZA Carbonara   :Salsa carbonara, jamón York, champiñones , cebolla roja, extra de queso")
        println("4 PIZZA Hawaina     :Doble jamón, piña , extra mozzarella, Salsa carbonara,extra de queso")
        println("5 PIZZA Meat Lovers :Salsa de tomate, carne, pepperoni, jamón de York, bacon y mozzarella")
        println("_________________________")
    }
    if (numero==2){
        println("_________________________")
        println("PIZZAS DE DOS MITADES")

        println("_________________________")
    }
    if (numero==3){
        println("_________________________")
        println("PIZZAS A TU MODO")

        println("_________________________")
    }

}

