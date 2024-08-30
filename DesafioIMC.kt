import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var sair: Char

 do{
    coletarDados()
    println("Clique [c] para continuar ou [s] para sair")
    sair = scanner.next()[0]
}while(sair != 's')
 
}

fun coletarDados(){
    val scanner = Scanner(System.`in`)
    var peso: Float
    var altura: Float

    print("Informe seu peso:")
    peso = scanner.nextFloat()
    print("Informe sua altura:")
    altura = scanner.nextFloat()

    var resultado = calcularIMC(peso, altura)

    when {
        resultado < 18.5 -> println("Excesso de Magreza")
        resultado < 25 -> println("Peso Normal")
        resultado < 30 -> println("Excesso de Peso")
        resultado < 35 -> println("Obesidade - Grau I")
        resultado < 40 -> println("Obesidade - Grau II")
        else -> println("Obesidade - Grau III")
    }
    
}
fun calcularIMC(peso: Float, altura: Float): Float{
    var imc = peso / (altura * altura)
    return imc
}
    

