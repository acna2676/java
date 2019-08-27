puclic interface Aggregate{
    public abstruct Iterator iterator();
}

publid interface Iterator{
    public abstruct boolean hasNext();
    public abstruct Object next();
}

public class Book{
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.books = new Book[maxsize]
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }
    public int getLength(){
        retrn last;
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}