static void main(String[] args) {
  def bookInventory = new BookInventory()

  // Beispiel zum Hinzufügen von Büchern
  bookInventory.addBook("Der Herr der Ringe", "J.R.R. Tolkien", 5)
  bookInventory.addBook("Harry Potter und der Stein der Weisen", "J.K. Rowling", 10)

  // Anzeigen des gesamten Buchinventars
  bookInventory.displayInventory()
}