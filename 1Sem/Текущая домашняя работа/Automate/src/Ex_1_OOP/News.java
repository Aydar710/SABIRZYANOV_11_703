package Ex_1_OOP;

public class News extends PrintedEdition {
    String tittle = "Fresh news of the day";
    String text = "Nothing interesting))";
    int date;
    public News(String tittle, String text, int date) {
        super(tittle, text);
        this.date = date;
    }
    public boolean isActuallyNews(int today){
        return this.date <= today;
    }
}
