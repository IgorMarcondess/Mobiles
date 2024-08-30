fun main(){
    var listaNum = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var somatorio = 0

    for (num in listaNum){
        if (num % 2 == 0){
            somatorio += num
        }
    }
    println("A soma dos numeros pares será: $somatorio")
}