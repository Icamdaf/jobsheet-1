import java.util.Scanner;

public class Tugas220 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu untuk memilih rumus
        int pilihan;
        do {
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
        } while (pilihan < 1 || pilihan > 3);

        // Membaca input
        double jarak, waktu, kecepatan;
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (m): ");
                jarak = scanner.nextDouble();
                System.out.print("Masukkan waktu (s): ");
                waktu = scanner.nextDouble();
                kecepatan = hitungKecepatan(jarak, waktu);
                System.out.println("Kecepatan: " + kecepatan + " m/s");
                break;
            case 2:
                System.out.print("Masukkan kecepatan (m/s): ");
                kecepatan = scanner.nextDouble();
                System.out.print("Masukkan waktu (s): ");
                waktu = scanner.nextDouble();
                jarak = hitungJarak(kecepatan, waktu);
                System.out.println("Jarak: " + jarak + " m");
                break;
            case 3:
                System.out.print("Masukkan kecepatan (m/s): ");
                kecepatan = scanner.nextDouble();
                System.out.print("Masukkan jarak (m): ");
                jarak = scanner.nextDouble();
                waktu = hitungWaktu(jarak, kecepatan);
                System.out.println("Waktu: " + waktu + " s");
                break;
        }
    }

    // Fungsi untuk menghitung kecepatan
    private static double hitungKecepatan(double jarak, double waktu) {
        return jarak / waktu;
    }

    // Fungsi untuk menghitung jarak
    private static double hitungJarak(double kecepatan, double waktu) {
        return kecepatan * waktu;
    }

    // Fungsi untuk menghitung waktu
    private static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }
}
