import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan Nilai (0-100): ");
        short nilai = input.nextShort();

        System.out.print("Status Aktif (true/false): ");
        boolean statusAktif = input.nextBoolean();

        System.out.print("Masukkan Kom (A/B/C): ");
        char kom = input.next().charAt(0);

        // Panggil class Konversi
        Konversi konversi = new Konversi();
        String nilaiHuruf = konversi.konversiNilai(nilai);

        // Output
        System.out.println("\n===== DATA MAHASISWA =====");
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur);
        System.out.println("Nilai Angka  : " + nilai);
        System.out.println("Nilai Huruf  : " + nilaiHuruf);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Kom          : " + kom);

        input.close();
    }
}
