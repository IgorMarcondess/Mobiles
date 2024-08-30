//CRIE UMA FUNÇÃO QUE SOMA ARRAYS COM NÚMEROS PARES E IMPARES

fun main(){
    var numbersPR = arrayOf(0, 2, 4, 6)
    var numbersIMP = arrayOf(1, 3, 5, 7)
    var incp = 0
    var inci = 0
    
    for (np in numbersPR){
        incp += np
    }
    for (np in numbersIMP){
        inci += np
    }

    println("Numeros pares: $incp")
    println("Numeros impares: $inci")
}