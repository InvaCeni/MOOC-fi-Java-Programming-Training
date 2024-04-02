
class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return name.equals(other.name) && publicationYear == other.publicationYear;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + publicationYear;
    }
}