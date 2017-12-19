package Ex_1_OOP;

public class Magazine extends PrintedEdition {
    int date;
    public Magazine(String tittle, String text, int date) {
        super(tittle, text);
        this.date = date;
    }
}
