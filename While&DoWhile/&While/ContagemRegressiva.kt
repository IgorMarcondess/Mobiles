//Contagem Regressiva
fun main(){

    println("Digite um número inteiro:")
    val num = readLine()!!.toInt()

    if (num != null && num.isNotEmpty()){
        var contador = num
        
        while (contador >= 1 ) {
        println(contador)
        contador--
    }
    }
}