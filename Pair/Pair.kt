fun main(){

    // UTILIZANDO O [ PAIR ] PARA DECLARAR O PAR DAS VARIAVEIS

    var (codigo, descricao) = Pair(4, "Mouse")
    println(codigo)
    println(descricao)

    //DECLARANDO O [PAIR] JÁ INFORMANDO QUAL TIPO ELE IRÁ RECEBER 
    var produto2: Pair<Int, String> = Pair(5, "Teclado")
    println(produto2.first) //IMPRIMINDO O PRIMEIRO DO PAIR
    println(produto2.second)//IMPRIMINDO O SEGUNDO DO PAIR

}