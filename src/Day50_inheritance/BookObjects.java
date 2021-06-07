package Day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author="Savitch";
        book.type = "programming";
        book.price= 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook= new AudioBook();
        audioBook.author ="unmesh";
        audioBook.length= 60;
        audioBook.narrator = "Aziz";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "automation";
        audioBook.listen();

        Ebook eBook = new Ebook();
        eBook.title = "java data structures";
        eBook.author="Savitch";
        eBook.type = "programming";
        eBook.price= 85.0;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();
    }
}
