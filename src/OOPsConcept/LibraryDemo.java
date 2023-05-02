package OOPsConcept;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Library {
    private String bookName;
    private String authorName;
    private int numCopies;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(String bookName, String authorName, int numCopies) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.numCopies = numCopies;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	public void borrowBook() {
		if (numCopies > 0) {
            numCopies--;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
	}
	public void returnBook() {
		numCopies++;
        System.out.println("Book returned successfully!");
		
	}
    
    
}
public class LibraryDemo {
	
	public static void main(String[] args) {
        List<Library> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Library("The Great Gatsby", "F. Scott Fitzgerald", 5));
        libraryBooks.add(new Library("To Kill a Mockingbird", "Harper Lee", 3));
        libraryBooks.add(new Library("1984", "George Orwell", 2));
        libraryBooks.add(new Library("Pride and Prejudice", "Jane Austen", 4));
        libraryBooks.add(new Library("The Catcher in the Rye", "J.D. Salinger", 1));
        libraryBooks.add(new Library("Brave New World", "Aldous Huxley", 3));
        libraryBooks.add(new Library("Animal Farm", "George Orwell", 2));
        libraryBooks.add(new Library("The Hobbit", "J.R.R. Tolkien", 6));
        libraryBooks.add(new Library("The Lord of the Rings", "J.R.R. Tolkien", 3));
        libraryBooks.add(new Library("One Hundred Years of Solitude", "Gabriel García Márquez", 2));


}
}