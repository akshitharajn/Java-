public class Book {
    private String name;
    private int isbn;
    private String author;
    private String pub;

    public Book(String name, int isbn,String author,String pub) {
        this.name = name;
        this.isbn=isbn;
        this.author = author;
        this.pub=pub;
    }

   
    public String getBookInfo() {
      
        return "Book Name: " + name + " , isbn: " + isbn +  ",Author: " + author  + ",pub :  " + pub ;
    }

    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book("Effective Java" ,123,"Joshua Bloch","akshi");

        
        System.out.println(book1.getBookInfo());
    }
}