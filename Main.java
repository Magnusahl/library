package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        boolean menuLoop = true;

        int choice;
        while(true) {
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. Quit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    String name;
                    System.out.println("Vad heter boken som du vill lägga till?");
                    name = input.next();
                    library.add(new Book(name));
                    System.out.println("Boken " + name + " tillagd i Biblan.");
                    break;
                case 2:
                    System.out.println("Vad heter boken som du letar efter?");
                    break;
                case 3:
                    for(library) {
                        System.out.println(library);
                    }
                    break;
                case 4:
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Hejdå");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Skriv 1-5");
                    break;
            }
        }
    }
}
