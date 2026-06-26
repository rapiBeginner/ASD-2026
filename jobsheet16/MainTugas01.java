import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MainTugas01 {
    List<Mahasiswa01> listMahasiswa = new ArrayList<>();
    List<MataKuliah01> listMK = new ArrayList<>();
    List<Nilai01> listNilai = new ArrayList<>();
    Queue<Mahasiswa01> queueHapusMhs = new LinkedList<>();

    public void initData() {
        listMahasiswa.add(new Mahasiswa01("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new Mahasiswa01("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new Mahasiswa01("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa01("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new Mahasiswa01("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new Mahasiswa01("20006", "Ubaidah", "021xxx"));

        listMK.add(new MataKuliah01("00001", "Internet of Things", 3));
        listMK.add(new MataKuliah01("00002", "Algoritma dan Struktur Data", 2));
        listMK.add(new MataKuliah01("00003", "Algoritma dan Pemrograman", 2));
        listMK.add(new MataKuliah01("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMK.add(new MataKuliah01("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public void tampilMahasiswa() {
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("*******");
        System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "No Telp");
        for (Mahasiswa01 m : listMahasiswa) {
            System.out.printf("%-10s %-15s %-10s\n", m.nim, m.nama, m.notelp);
        }
    }

    public void tampilMK() {
        System.out.println("DAFTAR MATA KULIAH");
        System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah01 mk : listMK) {
            System.out.printf("%-10s %-40s %-5d\n", mk.kode, mk.nama, mk.sks);
        }
    }

    public void inputNilai(Scanner sc) {
        System.out.print("Masukkan data\nKode: ");
        String kodeNilai = sc.nextLine();
        System.out.print("Nilai: ");
        double nilaiInput = sc.nextDouble();
        sc.nextLine();

        tampilMahasiswa();
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = sc.nextLine();
        Mahasiswa01 mhsTerpilih = null;
        for (Mahasiswa01 m : listMahasiswa) {
            if (m.nim.equals(nim)) {
                mhsTerpilih = m;
                break;
            }
        }

        tampilMK();
        System.out.print("Pilih MK by kode: ");
        String kodeMK = sc.nextLine();
        MataKuliah01 mkTerpilih = null;
        for (MataKuliah01 mk : listMK) {
            if (mk.kode.equals(kodeMK)) {
                mkTerpilih = mk;
                break;
            }
        }

        if (mhsTerpilih != null && mkTerpilih != null) {
            listNilai.add(new Nilai01(mhsTerpilih, mkTerpilih, nilaiInput));
        }
    }

    public void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai01 n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilai);
        }
    }

    public void cariNilai(Scanner sc) {
        System.out.print("Masukkan data mahasiswa [nim] : ");
        String nim = sc.nextLine();
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSKS = 0;
        for (Nilai01 n : listNilai) {
            if (n.mhs.nim.equals(nim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilai);
                totalSKS += n.mk.sks;
            }
        }
        System.out.println("Total SKS " + totalSKS + " telah diambil.");
    }

    public void urutNilai() {
        listNilai.sort((n1, n2) -> Double.compare(n1.nilai, n2.nilai));
        tampilNilai();
    }

    public void tambahAntrianHapus(Scanner sc) {
        tampilMahasiswa();
        System.out.print("Masukkan NIM mahasiswa yang akan dimasukkan ke antrian hapus: ");
        String nim = sc.nextLine();
        Mahasiswa01 mhsHapus = null;
        for (Mahasiswa01 m : listMahasiswa) {
            if (m.nim.equals(nim)) {
                mhsHapus = m;
                break;
            }
        }
        if (mhsHapus != null) {
            queueHapusMhs.add(mhsHapus);
            System.out.println(mhsHapus.nama + " dimasukkan ke antrian hapus.");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    public void eksekusiHapus() {
        if (!queueHapusMhs.isEmpty()) {
            Mahasiswa01 mhs = queueHapusMhs.poll();
            listMahasiswa.remove(mhs);
            listNilai.removeIf(n -> n.mhs.nim.equals(mhs.nim));
            System.out.println("Mahasiswa " + mhs.nama + " berhasil dihapus dari sistem.");
        } else {
            System.out.println("Antrian hapus kosong.");
        }
    }

    public static void main(String[] args) {
        MainTugas01 app = new MainTugas01();
        app.initData();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Antrikan Hapus Mahasiswa (Queue)");
            System.out.println("6. Eksekusi Hapus Mahasiswa (Queue)");
            System.out.println("7. Keluar");
            System.out.print("Pilih : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    app.inputNilai(sc);
                    break;
                case 2:
                    app.tampilNilai();
                    break;
                case 3:
                    app.cariNilai(sc);
                    break;
                case 4:
                    app.urutNilai();
                    break;
                case 5:
                    app.tambahAntrianHapus(sc);
                    break;
                case 6:
                    app.eksekusiHapus();
                    break;
            }
        } while (menu != 7);
        sc.close();
    }
}