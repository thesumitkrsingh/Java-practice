package OopPractice;
import java.util.*;


public class LibrarySystem {
    public static void main(String[] args){
        Library lib=new Library();
        Book b1=new Book("Java", "James", "001");
      lib.addBook(b1);

    }

}
class Book{

    String title;
    String author;
    String isbn;
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
}
class Library{
    List<Book> book=new ArrayList<Book>();
    void addBook(Book title){
        book.add(title);
    }
    void removeBook(String isbn){
        for(Book b:book){
            if(b.isbn.equals(isbn)){
               book.remove(b);
               System.out.println("removed!");
               break;
            }

        }
    }
    void searchBook(String author){
        for(Book b:book){
            if(b.author.equals(author)){
                System.out.println("found"+b.author);
            }

        }
        System.out.println("not Found");
    }
}
