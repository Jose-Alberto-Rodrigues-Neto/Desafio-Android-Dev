fun main() {
    var exit = false
    val library = Library()
    while (!exit){
        println("O que deseja fazer?\n1 - Adicionar livro\n2 - Ver todos os livros\n3 - Ver livro específico\n4 - Atualizar progresso em livro")
        val userChoice = readLine()!!.toInt()
        when (userChoice) {
            1 -> {
                println("Escreva os dados pedidos subsequentemente.\nTitulo:")
                val title = readLine()!!
                println("Genero:")
                val genre = readLine()!!
                println("Autor:")
                val autor = readLine()!!
                println("Páginas totais:")
                val totalPages = readLine()!!.toInt()
                println("Páginas lidas:")
                val pagesRead = readLine()!!.toInt()
                val newBook = Book(title, genre, autor, totalPages, pagesRead)
                library.addBook(newBook)
            }
            2 -> library.getBooks()
            3 -> {
                println("Digite o nome do livro que deseja ver as informações:")
                val title = readLine()!!
                library.getBookByTitle(title)
            }
            4 -> {
                println("Digite o nome do livro que deseja atualizar seu progresso:")
                val title = readLine()!!
                println("Digite o número de páginas que você leu até agora:")
                val pagesRead = readLine()!!.toInt()
                library.updatePagesByTitle(title, pagesRead)
            }
            else -> {
                println("Deseja sair da sua livraria particular?\nDigite 'S'(para sim) e 'N'(para não).")
                val userExit = readLine()!!
                if (userExit == "S") exit = true
            }
        }
    }
}