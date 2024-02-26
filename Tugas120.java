public class Tugas120 {

    public static void main(String[] args) {
        // Array satu dimensi untuk kode plat mobil
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array dua dimensi untuk nama kota
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'D', 'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'E', 'C', 'R', 'E', 'B'},
            {'F', 'B'},
            {'G', 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'H', 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'L', 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'N', 'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'T', 'E', 'G', 'A', 'L'}
        };

        // Menampilkan isi array
        for (int i = 0; i < KODE.length; i++) {
            System.out.print(KODE[i] + " ");
            for (int j = 0; j < KOTA[i].length; j++) {
                System.out.print(KOTA[i][j]);
            }
            System.out.println();
        }
    }
}
