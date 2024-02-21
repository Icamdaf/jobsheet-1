import java.util.Scanner;
import java.util.InputMismatchException;
8

public class Array20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int totalSks = 0;
        int totalNilai = 0;

        // Input jumlah mata kuliah
        System.out.println("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();

        // Perulangan untuk setiap mata kuliah
        for (int i = 1; i <= n; i++) {
            System.out.println("Masukkan nama mata kuliah ke-" + i + ": ");
            String namaMK = scanner.nextLine();

            // Handle potential non-integer input for SKS
            int sks = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Masukkan SKS mata kuliah " + namaMK + ": ");
                try {
                    sks = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer for SKS.");
                    scanner.nextLine(); // Clear the invalid input from scanner
                }
            }

            // Handle potential non-integer input for nilai
            int nilai = 0;
            validInput = false;
            while (!validInput) {
                System.out.println("Masukkan nilai mata kuliah " + namaMK + ": ");
                try {
                    nilai = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer for nilai.");
                    scanner.nextLine(); // Clear the invalid input from scanner
                }
            }

            // Menghitung total SKS dan total nilai
            totalSks += sks;
            totalNilai += nilai * sks;
        }

        // Menghitung IP Semester
        double ipSemester = (double) totalNilai / totalSks;

        // Menampilkan hasil
        System.out.println("Total SKS: " + totalSks);
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("IP Semester: " + String.format("%.2f", ipSemester));
    }
}
