package Ex_1_OOP;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("New Book", "bla-bla", "Aydar, Aydar");
        News news = new News("asd", "asd", 15);
        System.out.println(news.isActuallyNews(14));
        Magazine magazine = new Magazine("bla", "qw", 21);
        PrintedEdition webSite[] = {book, news, magazine};
        for (int i = 0; i < webSite.length; i++)
            System.out.println(webSite[i].tittle);
    }
}
