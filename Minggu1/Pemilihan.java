import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        double nilai[] = new double[4];
        Scanner sc = new Scanner(System.in);
        String jenis[] = {
                "Tugas", "Kuis", "UTS", "UAS"
        };

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        for (int i = 0; i < jenis.length; i++) {
            System.out.print("Masukkan Nilai " + jenis[i] + ": ");
            nilai[i] = sc.nextDouble();
        }
        System.out.println("======================");
        System.out.println("======================");
        boolean nilaiValid = true;
        for (double n : nilai) {
            if (n > 100 || n < 0) {
                System.out.println("nilai tidak valid");
                nilaiValid = false;
                break;
            }
        }
        if (nilaiValid) {
            double nilaAkhir = nilai[0] * 0.2 + nilai[1] * 0.2 + nilai[2] * 0.3 + nilai[3] * 0.4;
            String nilaiHuruf;
            if (nilaAkhir <= 39) {
                nilaiHuruf = "E";
            } else if (nilaAkhir <= 50) {
                nilaiHuruf = "D";
            } else if (nilaAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaAkhir <= 80) {
                nilaiHuruf = "B+";
            } else {
                nilaiHuruf = "A";
            }

            System.out.println("Nilai Akhir: " + nilaAkhir);
            System.out.println("nilai huruf: " + nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");
            if (nilaiHuruf == "D" || nilaiHuruf == "E") {
                System.out.println("Anda tidak lulus");
            } else {
                System.out.println("Selamat anda lulus");
            }
        }
    }
}