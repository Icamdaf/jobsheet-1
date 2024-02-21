public class Fungsi20 {

    private static String[] CABANG = {
        "Cabang 1",
        "Cabang 2",
        "Cabang 3"
    };

    private static int[][] STOK_AWAL = {
        {10, 15, 20, 25},
        {15, 20, 25, 30},
        {20, 25, 30, 35}
    };

    private static Map<String, Integer> HARGA = new HashMap<>();

    private static Map<String, Integer> PENGURANGAN_STOK = new HashMap<>();

    static {
        HARGA.put("Aglonema", 75000);
        HARGA.put("Keladi", 50000);
        HARGA.put("Alocasia", 60000);
        HARGA.put("Mawar", 10000);

        PENGURANGAN_STOK.put("Aglonema", -1);
        PENGURANGAN_STOK.put("Keladi", -2);
        PENGURANGAN_STOK.put("Alocasia", 0);
        PENGURANGAN_STOK.put("Mawar", -5);
    }

    public static void main(String[] args) {
        int[] pendapatan = hitungPendapatan(STOK_AWAL);
        tampilkanPendapatan(pendapatan);

        int[][] stokAkhir = hitungStok(STOK_AWAL, PENGURANGAN_STOK);
        tampilkanStok(stokAkhir);
    }

    private static int[] hitungPendapatan(int[][] stok) {
        int[] pendapatan = new int[CABANG.length];
        for (int i = 0; i < CABANG.length; i++) {
            int totalPendapatanCabang = 0;
            for (int j = 0; j < HARGA.size(); j++) {
                String jenisBunga = (String) HARGA.keySet().toArray()[j];
                totalPendapatanCabang += stok[i][j] * HARGA.get(jenisBunga);
            }
            pendapatan[i] = totalPendapatanCabang;
        }
        return pendapatan;
    }

    private static void tampilkanPendapatan(int[] pendapatan) {
        for (int i = 0; i < CABANG.length; i++) {
            System.out.println("Pendapatan " + CABANG[i] + ": Rp " + pendapatan[i]);
        }
    }

    private static int[][] hitungStok(int[][] stokAwal, Map<String, Integer> penguranganStok) {
        int[][] stokAkhir = new int[CABANG.length][];
        for (int i = 0; i < CABANG.length; i++) {
            int[] stokCabang = new int[HARGA.size()];
            for (int j = 0; j < HARGA.size(); j++) {
                String jenisBunga = (String) HARGA.keySet().toArray()[j];
                stokCabang[j] = stokAwal[i][j] + penguranganStok.get(jenisBunga);
            }
            stokAkhir[i] = stokCabang;
        }
        return stokAkhir;
    }

    private static void tampilkanStok(int[][] stok) {
        for (int i = 0; i < CABANG.length; i++) {
            System.out.println("Stok " + CABANG[i] + ":");
            for (int j = 0; j < HARGA.size(); j++) {
                String jenisBunga = (String) HARGA.keySet().toArray()[j];
                System.out.println("- " + jenisBunga + ": " + stok[i][j]);
            }
        }
    }
}
