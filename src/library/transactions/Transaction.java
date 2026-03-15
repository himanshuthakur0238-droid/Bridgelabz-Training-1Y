package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void issueBook(Book book, Member member) {
        System.out.println("Book Issued Successfully");
        System.out.println("Issued to: " + member.name);
        System.out.println("Book: " + book.title);
    }
}
