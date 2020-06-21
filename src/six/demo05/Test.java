package six.demo05;

import java.io.*;

public class Test {
    public static void main(String args[]) throws
            IOException, ClassNotFoundException {
        Book book = new Book(100032, "Java Programming Skills", "Wang Sir", 30);
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("/home/ygj/IdeaProjects/review2/src/six/demo05/book.dat"));
        oos.writeObject(book);
        oos.close();
        book = null;
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/home/ygj/IdeaProjects/review2/src/six/demo05/book.dat"));
        book = (Book) ois.readObject();
        ois.close();
        System.out.println("ID is:" + book.id);
        System.out.println("name is:" + book.name);
        System.out.println("author is:" + book.author);
        System.out.println("price is:" + book.price);
    }

}
