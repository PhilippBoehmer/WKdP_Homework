package HW2.Ex1;

public class Main {
    public static void main(String[] args) {
        // Create a new Publication object
        Publication publication = new Publication("Introduction to Java", 2020);

        // Print the information of the publication
        //System.out.println(publication.getInfo());

        Book book = new Book("Java Programming", 2021, "John Doe");
        //System.out.println(book.getInfo());

        Textbook textbook = new Textbook("Advanced Java", 2022, "Jane Smith", "Computer Science");
        System.out.println(textbook.getInfo());
    }
}
