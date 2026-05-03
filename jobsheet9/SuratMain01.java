import java.util.Scanner;

public class SuratMain01 {
    public static void main(String[] args) {
        StackSurat01 stack = new StackSurat01(5);
        Scanner raffi = new Scanner(System.in);
        int pilih;
        do {
            System.out.println(
                    "\nMenu: \n1. Terima Surat izin \n2. Proses Surat izin \n3. Lihat Surat Izin Terakhir \n4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = raffi.nextInt();
            raffi.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("id surat          : ");
                    String idSurat = raffi.nextLine();
                    System.out.print("Nama mahasiswa    : ");
                    String namaMahasiswa = raffi.nextLine();
                    System.out.print("Kelas             : ");
                    String kelas = raffi.nextLine();
                    System.out.print("Jenis izin (I/S)  : ");
                    char jenisIzin = raffi.nextLine().charAt(0);
                    System.out.print("Durasi (hari)     : ");
                    int durasi = raffi.nextInt();
                    stack.push(new Surat01(idSurat, namaMahasiswa, kelas, jenisIzin, durasi));
                    break;
                case 2:
                    Surat01 teratas = stack.peak();
                    teratas.tampil();
                    System.out.print("Konfirmasi izin tersebut? (Y/N): ");
                    char konfirmasi = raffi.nextLine().charAt(0);
                    if (konfirmasi == 'Y') {
                        stack.pop();
                        System.out.println("Izin dari " + teratas.namaMahasiswa + " telah dikonfirmasi");
                    }
                    break;
                case 3:
                    Surat01 top = stack.peak();
                    top.tampil();
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String nama = raffi.nextLine();
                    Surat01[] hasil = stack.serch(nama);
                    if (hasil[0] != null) {
                        int index = 0;

                        while (hasil[index] != null) {
                            hasil[index].tampil();
                            index++;
                        }
                    } else {
                        System.out.println("Data yang dicari tidak ditemukan");
                    }
                    break;
                default:
                    break;
            }
        } while (pilih > 0 & pilih <= 4);

        raffi.close();
    }
}
