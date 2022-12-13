import java.util.Objects;

public class Book {
    private String title;
    private int yearPublication;
    private Author author;

    public Book(String title, int yearPublication, Author author) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getYearPublication() == book.getYearPublication() && getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getYearPublication(), getAuthor());
    }

    @Override
    public String toString() {
        return "Название: \"" + title + "\"" +
                ", Год издания: " + yearPublication +
                ", Автор: " + author.toString();
    }
}
