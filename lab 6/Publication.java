 class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthorName() {
        return author_name;
    }

    public void display() {
        System.out.println("Author name: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        super.display();
        System.out.println("Book title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        super.display();
        System.out.println("Paper title: " + title);
    }
}

public class Publication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an author name as a command line argument.");
            return;
        }

        String authorName = args[0];
        Book book = null;

        for (int i = 1; i < args.length; i++) {
            String arg = args[i];
            if (arg.equalsIgnoreCase("book")) {
                if (i + 1 < args.length) {
                    String title = args[++i];
                    book = new BookPublication(authorName, title);
                } else {
                    System.out.println("Please provide a book title after 'book' command line argument.");
                    return;
                }
            }
        }
        for (int i = 1; i < args.length; i++){
            String arg = args[i];
            if (arg.equalsIgnoreCase("paper")) {
                if (i + 1 < args.length) {
                    String title = args[++i];
                    book = new PaperPublication(authorName, title);
                } 
                else {
                    System.out.println("Please provide a paper title after 'paper' command line argument.");
                    return;
                }
            }
        }
    

        if (book != null) {
            book.display();
        }
    }
}