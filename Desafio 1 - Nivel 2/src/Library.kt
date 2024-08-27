class Library {
    private var books = mutableListOf<Book>()
    fun addBook(book: Book) {
        books.add(book)
        println("Novo livro adicionado:")
        book.getBookInfo()
    }
    fun getBooks() {
        println("Livros na sua livraria particular:")
        books.forEach {
            println("${it.title};")
        }
        println()
    }
    fun getBookByTitle(title: String){
        val book = books.find { it.title == title }
        if(book == null) return println("Não existe nenhum livrom com esse nome!\n")
        book.getBookInfo()
    }
    fun updatePagesByTitle(title: String, pagesRead: Int) {
        val book = books.find { it.title == title }
        if(book == null) return println("Esse livro não está em sua livraria particular!")
        book.pagesRead = pagesRead
        println("Livro atualizado:")
        book.getBookInfo()
    }
}

class Book(
    val title: String,
    val genre: String,
    val author: String,
    val totalPages: Int,
    var pagesRead: Int

) {
    fun getReadProgression(): String {
        val progression = "%.2f".format((pagesRead.toDouble()/totalPages) * 100)
        return "O seu progresso em $title foi de $progression%\n"
    }
    fun getBookInfo() {
        println("Livro: $title, \nGênero: $genre, \nAutor: $author, \nTotal de páginas: $totalPages, \nPáginas lidas: $pagesRead, \nProgresso: ${getReadProgression()}\n")
    }
}