package HW2.Ex1;

public class Book extends Publication{

    private String author;
    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Author: " + author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
