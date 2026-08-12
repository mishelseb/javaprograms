package OOPSC26CS070;

class Book
{
    String title;
    String author;
    double price;
    
    Book()
    {
        title = "Java Learning";
        author = "Cyril";
        price = 200.0;
    }

    Book(String t)
    {
        title = t;
        author = "Abhinav";
        price = 250.0;
    }

    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }

    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class BookConstructorOverloading
{
    public static void main(String args[])
    {
    
        Book b1 = new Book();

        
        Book b2 = new Book("Java Basics");

    
        Book b3 = new Book("Effective Java", "Joshua Bloch", 45.0);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Title Constructor:");
        b2.display();

        System.out.println("Parameterized Constructor:");
        b3.display();
    }
}
