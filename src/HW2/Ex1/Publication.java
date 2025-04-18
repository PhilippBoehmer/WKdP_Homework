package HW2.Ex1;

public class Publication {
    private String title;
    private int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getInfo(){
        return "Title: " + title + ", Year: " + Integer.toString(year);
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
