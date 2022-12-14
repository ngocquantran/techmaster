import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;
    private int publishingYear;
    private String publisher;

    public Book(int id, String title, String[] category, String author, int publishingYear, String publisher) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.publishingYear = publishingYear;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
