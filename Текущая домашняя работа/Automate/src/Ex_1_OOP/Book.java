package Ex_1_OOP;

public class Book extends PrintedEdition {
    String type = "Книжное издание";
    String tittle;
    String text;
    String listOfAuthors;

    public Book(String tittle, String text, String listOfAuthors) {
        super(tittle, text);
        this.listOfAuthors = listOfAuthors;
    }
}
