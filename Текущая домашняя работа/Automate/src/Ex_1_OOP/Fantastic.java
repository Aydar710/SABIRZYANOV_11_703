package Ex_1_OOP;

public class Fantastic extends Book {
    String type = "Книжное издание";
    String tittle;
    String text;
    String listOfAuthors;
    boolean isInteresting;
    public Fantastic(String tittle, String text, String listOfAuthors, boolean isInteresting) {
        super(tittle, text, listOfAuthors);
        this.isInteresting = this.isInteresting;
    }
}
