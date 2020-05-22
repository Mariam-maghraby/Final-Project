package CMPproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of books needed to be entered:");
        int arrayCols = scan.nextInt();
        String array[][] = new String[3][arrayCols];
        enterBooksData(scan, array, arrayCols);
        printBookData(array, arrayCols);
    }

    public static void enterBooksData(Scanner scan1, String[][] matrix,  int matrixColumn) {
        System.out.println("Enter the book data");
        System.out.println("Enter the book name");
        String bookName = scan1.next();
        System.out.println("Enter the author name");
        String authorName = scan1.next();
        System.out.println("Enter the date of publishing");
        String dateOfPublish = scan1.next();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < matrixColumn-1; j++) {
                matrix[3][matrixColumn] = String.valueOf(scan1.nextInt());
            }
        }
        System.out.println(matrix);
    }

    public static void printBookData(String[][] matrix, int matrixCols) {
        System.out.println("The Data of the book: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < matrixCols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();

        }
    }
}

