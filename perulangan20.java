import java.util.Scanner;

public class perulangan20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input NIM
        System.out.println("Masukkan NIM Anda: ");
        String nim = scanner.nextLine();

        // Mendapatkan 2-digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Menampilkan deret bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}
