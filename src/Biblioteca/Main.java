package Biblioteca;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("12345","Blancanieves","2023");

        System.out.println(libro1.toString());
        libro1.prestar();
    }
}
