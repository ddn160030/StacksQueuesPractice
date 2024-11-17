public class FA2024_Book_NguyenD {

    //data members
    private String ISBN;
    private String title;
    private String writer;
    private String publisher;

    //constructor
    public FA2024_Book_NguyenD()
    {
        ISBN = "";
        title = "";
        writer = "";
        publisher = "";
    }

    //constructor
    public FA2024_Book_NguyenD(String isbn, String t, String w, String p)
    {
        ISBN = isbn;
        title = t;
        writer = w;
        publisher = p;
    }

    public String toString()
    {
        return    String.format("\n%-12s%-30s\n", "ISBN:", ISBN)
                + String.format("%-12s%-30s\n", "Book Title:", title)
                + String.format("%-12s%-30s\n", "Writer:", writer)
                + String.format("%-12s%-30s\n", "Publisher:", publisher);
    }
}