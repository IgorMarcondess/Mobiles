//CRIAR UM PROGRAMA QUE SOLICITA UM NUMERO INTEIRO POSITIVO E CALCULA A SOMA DE TODOS OS MULTIPLOS DE 3 QUE SEJAM MENORES 

fun main(){

    println("Digite um numero inteiro positivo: ")
    val numero = readLine()!!.toInt()

    var soma = 0
    var contador = 3

    while (contador <= numero){
        soma += contador 
        contador += 3
    }

    println("A soma dos múltiplos de 3 será: $soma")
}