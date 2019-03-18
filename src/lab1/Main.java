package lab1;


import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Book book = new Book(30);
        System.out.println("Price: " + book.getPrice());
        displayMethod (book);

    }

    public static void displayMethod(Book book) {
        Class c = book.getClass();
        Method[] allMethods = c.getMethods();
        for (Method m:allMethods) {
            System.out.println(m);
        }
    }
}
