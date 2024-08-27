fun main() {
    println("Vamos ver seu progresso no livro que desejar!\nQual o nome do livro que você está lendo?")
    val bookName = readLine()!!
    println("Digite agora o número total de páginas do livro:")
    val bookTotalPages = readLine()!!.toInt()
    println("Digite quantas páginas você já leu até o momento:")
    val pagesRead = readLine()!!.toInt()
    val progression = readProgression(bookName, bookTotalPages, pagesRead)
    println(progression)
}

fun readProgression(bookName:String, bookTotalPages: Int, pagesRead: Int): String{
    if(bookTotalPages<=0) return  "Número total de páginas é menor ou igual a zero. Tente novamente colocando um número de páginas válida!"
    if (pagesRead<=0) return "Você ainda não leu o livro."
    val progressionPercentage: Double = (pagesRead.toDouble() / bookTotalPages) * 100
    return "Sua progressão no livro $bookName é de ${"%.2f".format(progressionPercentage)}%"
}