import java.util.Scanner;

public class pemilihan20 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Deklarasi variabel
    double nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS, nilaiAkhir;
    String nilaiHuruf;
    String keterangan;
    
    // Input nilai
    System.out.println("Masukkan nilai tugas (0-100): ");
    nilaiTugas = scanner.nextDouble();
    System.out.println("Masukkan nilai kuis (0-100): ");
    nilaiKuis = scanner.nextDouble();
    System.out.println("Masukkan nilai UTS (0-100): ");
    nilaiUTS = scanner.nextDouble();
    System.out.println("Masukkan nilai UAS (0-100): ");
    nilaiUAS = scanner.nextDouble();


    // Validasi nilai
    if (nilaiTugas < 0 || nilaiTugas > 100 ||
        nilaiKuis < 0 || nilaiKuis > 100 ||
        nilaiUTS < 0 || nilaiUTS > 100 ||
        nilaiUAS < 0 || nilaiUAS > 100) {
      System.out.println("Nilai tidak valid!");
      return;
    }

    // Menghitung nilai akhir
    nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

    // Konversi nilai dan keterangan
    if (nilaiAkhir >= 85) {
      nilaiHuruf = "A";
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 80) {
      nilaiHuruf = "A" ;
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 75) {
      nilaiHuruf = "B" ;
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 70) {
      nilaiHuruf = "B";
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 65) {
      nilaiHuruf = "B";
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 60) {
      nilaiHuruf = "C" ;
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 55) {
      nilaiHuruf = "C";
      keterangan = "LULUS";
    } else if (nilaiAkhir >= 50) {
      nilaiHuruf = "D";
      keterangan = "TIDAK LULUS";
    } else {
      nilaiHuruf = "E";
      keterangan = "TIDAK LULUS";
    }

    // Menampilkan hasil
    System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
    System.out.println("Nilai Huruf: " + nilaiHuruf);
    System.out.println("Keterangan: " + keterangan);
  }
}
