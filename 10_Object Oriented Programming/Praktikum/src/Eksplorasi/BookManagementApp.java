package Eksplorasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BookManagementApp {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Buku> listBuku = new ArrayList<>();

    public static void main(String[] args) {
        int menuProgram;
        do {
            System.out.println("Welcome to book management app");
            System.out.println("Please choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");

            menuProgram = scanner.nextInt();
            scanner.nextLine();

            switch (menuProgram) {
                case 1:
                    createNewBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Bye....");
                    break;
                default:
                    System.out.println("Invalid menu option. Please choose a valid menu option.");
            }
        }
        while (menuProgram != 6);
    }

    private static void createNewBook() {
        System.out.print("Enter Title: ");
        String judul = scanner.nextLine();

        System.out.print("Enter Author: ");
        String penulis = scanner.nextLine();

        System.out.print("Enter Category: ");
        String kategori = scanner.nextLine();

        Buku buku = new Buku(judul, penulis, kategori);
        listBuku.add(buku);
        System.out.println("Book created with ID: " + buku.getId());

    }

    private static void getAllBooks() {
        System.out.println("===ALL BOOKS===");
        for (Buku buku : listBuku) {
            System.out.println("===");
            System.out.println("ID: " + buku.getId());
            System.out.println("Title: " + buku.getJudul());
            System.out.println("Author: " + buku.getPenulis());
            System.out.println("Category: " + buku.getKategori());
            System.out.println("===");
        }
    }

    private static void getBookById() {
        System.out.println("Enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Buku buku : listBuku) {
            if (buku.getId().equals(id)) {
                System.out.println("===");
                System.out.println("ID: " + buku.getId());
                System.out.println("Title: " + buku.getJudul());
                System.out.println("Author: " + buku.getPenulis());
                System.out.println("Category: " + buku.getKategori());
                System.out.println("===");
                return;
            }
        }
        System.out.println("Book not found with ID: " + id);
    }

    private static void updateBook(){
        System.out.println("Enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Buku buku : listBuku) {
            if (buku.getId().equals(id)) {

                System.out.println("Enter title: ");
                String judulBaru = scanner.nextLine();
                buku.setJudul(judulBaru);

                System.out.println("Enter author: ");
                String penulisBaru = scanner.nextLine();
                buku.setPenulis(penulisBaru);

                System.out.println("Enter category: ");
                String kategoriBaru = scanner.nextLine();
                buku.setKategori(kategoriBaru);

                System.out.println("book updated!");

                System.out.println("===");
                System.out.println("ID: " + buku.getId());
                System.out.println("Title: " + buku.getJudul());
                System.out.println("Author: " + buku.getPenulis());
                System.out.println("Category: " + buku.getKategori());
                System.out.println("===");

                return;
            }
        }
        System.out.println("Book not found with ID: " + id);
    }

    private static void deleteBook(){
        System.out.print("Enter book ID: ");
        UUID id = UUID.fromString(scanner.nextLine());
        for (Buku book : listBuku) {
            if (book.getId().equals(id)) {
                listBuku.remove(book);
                System.out.println("book deleted!");
                return;
            }
        }
        System.out.println("Book not found with ID: " + id);
    }
}