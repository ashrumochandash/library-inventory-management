package za.co.librarymanagement.service;

import java.util.List;

import za.co.librarymanagement.dto.BookCreateDTO;
import za.co.librarymanagement.dto.BookSearchDTO;
import za.co.librarymanagement.dto.PatronDTO;
import za.co.librarymanagement.entity.Book;

public interface LibraryManagementService {
	
	public void addBook(BookCreateDTO bookDto);
	public List<Book> searchBook(BookSearchDTO bookSearchDTO);
	public Book getBookById(long id);
	public Book checkoutBook(Book book, PatronDTO patronDTO);
	public void returnBook(Book book);
	public List<Book> checkedOutBookList();
	public int checkPatronAllowedBorrowingLimit(long id);
	public void bookReservation(Book book, PatronDTO patronDTO);
	public void generateOverdueNotice();

}
