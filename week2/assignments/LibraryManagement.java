package week2.assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library LibraryManagement = new Library();
		String bookTitle = LibraryManagement.addBook("bookTitle");
		System.out.println(bookTitle);
		LibraryManagement.issueBook();
	}

}
