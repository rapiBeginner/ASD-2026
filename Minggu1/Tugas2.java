import java.util.Arrays;
import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    static String jadwal[][];

    static void inputJadwal() {
        System.out.print("Masukkan jumlah matkul: ");
        int jumlahMatkul = sc.nextInt();

        sc.nextLine();
        jadwal = new String[jumlahMatkul][4];
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Mata Kuliah ke-" + (i + 1));
            for (int j = 0; j < jadwal[i].length; j++) {
                if (j == 0) {
                    System.out.print("Masukkan nama mata kuliah: ");
                    jadwal[i][j] = sc.nextLine();
                } else if (j == 1) {
                    System.out.print("Masukkan Ruang kuliah: ");
                    jadwal[i][j] = sc.nextLine();
                } else if (j == 2) {
                    System.out.print("Masukkan hari mata kuliah: ");
                    jadwal[i][j] = sc.nextLine();
                } else {
                    System.out.print("Masukkan jam mata kuliah: ");
                    jadwal[i][j] = sc.nextLine();
                }
            }
            System.out.println();
        }
    }

    static void tampilJadwal() {
        if (jadwal[0][0] != null) {
            System.out.printf("%-20s%-20s%-20s%-20s", "Nama", "Ruang", "Hari", "Jam");
            System.out.println();
            for (String[] strings : jadwal) {
                for (String satuJadwal : strings) {
                    System.out.printf("%-20s", satuJadwal.trim());
                }
                System.out.println();
            }
        }
    }

    static void tampilJadwalNama(){
        System.out.print("Masukkan nama matkul yang dicari: ");
        String nama = sc.next();
        System.out.printf("%-20s%-20s%-20s%-20s", "Nama", "Ruang", "Hari", "Jam");
        System.out.println();
        for (String[] strings : jadwal) {
            if (strings[0].toLowerCase().contains(nama.toLowerCase())) {
                for (String satuJadwal : strings) {
                    System.out.printf("%-20s", satuJadwal.trim());
                }
                System.out.println();
            }
        }
    }

    static void tampilJadwalHari() {
        System.out.println("Masukkan hari: ");
        String hari = sc.next();
        System.out.printf("%-20s%-20s%-20s%-20s", "Nama", "Ruang", "Hari", "Jam");
        System.out.println();
        for (String[] strings : jadwal) {
            if (strings[2].equalsIgnoreCase(hari)) {
                for (String satuJadwal : strings) {
                    System.out.printf("%-20s", satuJadwal.trim());
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        inputJadwal();
        while (true) {
            System.out.print("\n1.Input jadwal\n2.Lihat jadwal\n3.Pilih jadwal dari hari\n4.Cari jadwal Matkul\n5.exit\nPilih menu:");
            int pilihan = sc.nextInt();
            System.out.println();
            if (pilihan == 1) {
                inputJadwal();
            } else if (pilihan == 2) {
                tampilJadwal();
            } else if (pilihan == 3) {
                tampilJadwalHari();
            }else if (pilihan==4) {
                tampilJadwalNama();
            } 
            else if (pilihan==5) {
                break;
            }
            else {
                System.out.println("Pilihan tidak valid\n");
            }
        }
    }
}
