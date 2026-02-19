import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matkul[] = {
                "Pancasila",
                "KTI",
                "CTPS",
                "Matdas",
                "Bahasa Inggris",
                "Daspro",
                "Praktikum Daspro",
                "K3"
        };

        double nilai[] = new double[8];
        int sks[] = {
                2, 2, 2, 2, 2, 2, 3, 2,
        };
        String nilaiHuruf[] = new String[8];
        double bobotNilai[] = new double[8];
        double totalNilaiSKS = 0;
        double totalSKS = 0;
        System.out.println("====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai " + matkul[i] + ": ");
            nilai[i] = sc.nextDouble();
            if (nilai[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            } else if (nilai[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            } else if (nilai[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2;
            } else if (nilai[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            } else if (nilai[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            }
            totalNilaiSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }
        System.out.println("====================================");
        System.out.println("Hasil konversi Nilai");
        System.out.println("====================================");
        double ip = totalNilaiSKS / totalSKS;
        System.out.printf("%-30s%-20s%-20s%-20s\n","MK","Nilai Angka","Nilai Huruf","Bobot Nilai");
        for (int j = 0; j < bobotNilai.length; j++) {
            System.out.printf("%-33s%-20s%-20s%-20s\n",matkul[j],nilai[j],nilaiHuruf[j],bobotNilai[j]);
        }
        System.out.println("====================================");
        System.out.println("IP anda: " + String.format("%.2f", ip));
    }
}
