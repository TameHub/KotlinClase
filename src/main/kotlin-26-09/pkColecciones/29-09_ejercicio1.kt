fun main(args: Array<String>) {

    fun clasificarNum(a:Int) :String{
        var c :String ="retur"
        when{
            a>0 -> c = "Es positivo"
            a==0 -> c = "Es cero"
            else -> c = "puto konlin"
        }
        return c

    }
    print(clasificarNum(5))

}