package gen02_03e.v1;

public class Book {
    private String name;
    private String author;
    private double weight;

    public Book(String name, String author, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", weight=" + weight +
                '}';
    }
}
