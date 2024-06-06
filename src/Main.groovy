static void main(String[] args) {
  def bookInventory = new BookInventory()

  // Beispiel zum Hinzufügen von Büchern
  bookInventory.addBook("Der Herr der Ringe", "J.R.R. Tolkien", 5)
  bookInventory.addBook("Harry Potter und der Stein der Weisen", "J.K. Rowling", 10)

  // Anzeigen des gesamten Buchinventars
  bookInventory.displayInventory()

  // Beispiel zum Löschen eines Buches
  bookInventory.removeBook("Der Herr der Ringe")

  // Anzeigen des aktualisierten Buchinventars
  bookInventory.displayInventory()

  // Beispiel zum Suchen nach einem Buch
  def searchedBook = bookInventory.searchBook("Der Herr der Ringe")
  if (searchedBook) {
    println("Buch gefunden: Titel: ${searchedBook.title}, Autor: ${searchedBook.author}, Menge: ${searchedBook.quantity}")
  } else {
    println("Buch nicht gefunden.")
  }
}