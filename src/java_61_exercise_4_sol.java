class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!!");
    }

    void showAvailableBooks(){
        System.out.println("Available Book are : ");
        for (int i = 0; i <this.books.length ; i++) {
            if(books[i]==null){
                continue;
            }
            System.out.println("* "+ books[i]);
        }
    }

    void issueBook(String book){
        for (int i = 0; i <this.books.length ; i++) {
            if(this.books[i]==book){
                System.out.println("Issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class java_61_exercise_4_sol {
    public static void main(String[] args) {
        Library cL = new Library();
        cL.addBook("C++");
        cL.addBook("Python");
        cL.addBook("Java");
        cL.showAvailableBooks();
        cL.issueBook("C++");
        cL.showAvailableBooks();
        cL.returnBook("C++");
        cL.showAvailableBooks();
    }
}
