fun soma(a: Int, b: Int) : Int {
    var quadradoA = a * a
    var quadradoB = a * a
    
    return quadradoA + quadradoB
}

fun main() {
    var ResultadoSoma = soma(10, 20)
    println("resultado da soma: $resultadoSoma")
}
