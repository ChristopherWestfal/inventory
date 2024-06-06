class BookInventory {
    def books = []

    // Funktion zum Hinzufügen eines Buches zum Inventar
    def addBook(String title, String author, int quantity) {
        def book = [title: title, author: author, quantity: quantity]
        books << book
        println("Buch '$title' von $author wurde dem Inventar hinzugefügt.")
    }

    // Funktion zum Löschen eines Buches aus dem Inventar
    def removeBook(String title) {
        def removedBook = books.find { it.title == title }
        if (removedBook) {
            books.remove(removedBook)
            println("Buch '$title' wurde aus dem Inventar entfernt.")
        } else {
            println("Buch '$title' konnte nicht gefunden und entfernt werden.")
        }
    }

    // Funktion zum Anzeigen des gesamten Buchinventars
    def displayInventory() {
        println("Buchinventar:")
        books.each { book ->
            println("Titel: ${book.title}, Autor: ${book.author}, Menge: ${book.quantity}")
        }
    }
}

