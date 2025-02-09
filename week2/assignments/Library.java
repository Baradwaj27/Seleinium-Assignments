package week2.assignments;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library LibraryManagement = new Library();
		String bookTitle = null;
		LibraryManagement.addBook(bookTitle);
		LibraryManagement.issueBook();
		
	}

}
