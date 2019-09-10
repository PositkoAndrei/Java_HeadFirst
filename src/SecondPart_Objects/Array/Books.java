package SecondPart_Objects.Array;

class BookTest {
    String author;
    String title;
}

public class Books {
    public static void main(String[] args) {

        BookTest[] myBooks = new BookTest[3];
        myBooks[0] = new BookTest();
        myBooks[1] = new BookTest();
        myBooks[2] = new BookTest();

        int x = 0;

        myBooks[0].title = "Плоды в Java";
        myBooks[1].title = "Java Гетсби";
        myBooks[2].title = "Сборник рецептов по Java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3){
            System.out.println(myBooks[x].title);
            System.out.println(" автор - " + myBooks[x].author);
            x = x + 1;
        }
    }
}