package Minggu6;

public class MahasiswaBerprestasi01 {
    Mahasiswa01[] listMhs = new Mahasiswa01[5];
    int idx;

    void tambah(Mahasiswa01 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }
    }

    void tampil() {
        for (Mahasiswa01 mahasiswa01 : listMhs) {
            mahasiswa01.tampilInformasi();
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                // break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ditemukan pada indeks "+pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos!=-1) {
            System.out.println("nim\t: "+listMhs[pos].nim);
            System.out.println("nama\t: "+listMhs[pos].nama);
            System.out.println("kelas\t: "+listMhs[pos].kelas);
            System.out.println("ipk\t: "+x);
        }else{
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }


}
