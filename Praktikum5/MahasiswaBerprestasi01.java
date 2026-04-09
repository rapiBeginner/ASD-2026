package Praktikum5;

import Minggu5.Tugas.nilaiMahasisa;

public class MahasiswaBerprestasi01 {
    Mahasiswa01[] listMhs = new Mahasiswa01[5];
    int idx;

    void tambah(Mahasiswa01 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa01 m:listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa01 tmp= listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
