package Minggu3;

public class DataDosen01 {
    void dataSemuaDosen(Dosen01[] arrayOfDosen) {
        int counter = 1;
        System.out.println("\n====DAFTAR DOSEN=====");
        for (Dosen01 dosen01 : arrayOfDosen) {
            System.out.println("Data dossen ke-" + counter);
            System.out.println("Kode            :" + dosen01.kode);
            System.out.println("Nama            :" + dosen01.nama);
            System.out.println("Usia            :" + dosen01.usia);
            String jenisKelamin = dosen01.jenisKelamin == true ? "Perempuan" : "Laki-laki";
            System.out.println("Jenis Kelamin   :" + jenisKelamin);
            System.out.println("--------------------------------");
            counter++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int countLk = 0, countPr = 0;
        for (Dosen01 dosen01 : arrayOfDosen) {
            if (dosen01.jenisKelamin == true) {
                countPr++;
            } else {
                countLk++;
            }   
        }
        System.out.println("------------------------------");
        System.out.println("Jumlah dosen perempuan: " + countPr);
        System.out.println("Jumlah dosen laki-laki: " + countLk);
        System.out.println("------------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayOfDosen) {
        int countLk = 0, countPr = 0, totalUsiaPr = 0, totalUsiaLk = 0;
        for (Dosen01 dosen01 : arrayOfDosen) {
            if (dosen01.jenisKelamin == true) {
                countPr++;
                totalUsiaPr += dosen01.usia;
            } else {
                countLk++;
                totalUsiaLk += dosen01.usia;
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Rata-rata usia dosen laki-laki: " + (int) (totalUsiaLk / countLk));
        System.out.println("Rata-rata usia dosen perempuan: " + (int) (totalUsiaPr / countPr));
        System.out.println("-------------------------------------------------------------");
    }

    void infoDosenPalingTua(Dosen01[] arrayOfDosen) {
        int umurTertua = 0;
        int indexTertua = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > umurTertua) {
                indexTertua = i;
                umurTertua = arrayOfDosen[i].usia;
            }
        }
        System.out.println("\n======================INFO DOSEN TERTUA======================");
        System.out.println("Kode                :" + arrayOfDosen[indexTertua].kode);
        System.out.println("Nama                :" + arrayOfDosen[indexTertua].nama);
        String jk = arrayOfDosen[indexTertua].jenisKelamin == true ? "Perempuan" : "Laki-laki";
        System.out.println("Jenis Kelamin       :" + jk);
        System.out.println("Usia                :" + arrayOfDosen[indexTertua].usia);
        System.out.println("-------------------------------------------------------------");

    }

    void infoDosenPalingmuda(Dosen01[] arrayOfDosen) {
        int umurTermuda = 100000000;
        int indexTermuda = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < umurTermuda) {
                indexTermuda = i;
                umurTermuda = arrayOfDosen[i].usia;
            }
        }
        System.out.println("\n======================INFO DOSEN TERMUDA======================");
        System.out.println("Kode                :" + arrayOfDosen[indexTermuda].kode);
        System.out.println("Nama                :" + arrayOfDosen[indexTermuda].nama);
        String jk = arrayOfDosen[indexTermuda].jenisKelamin == true ? "Perempuan" : "Laki-laki";
        System.out.println("Jenis Kelamin       :" + jk);
        System.out.println("Usia                :" + arrayOfDosen[indexTermuda].usia);
        System.out.println("-------------------------------------------------------------");

    }

}
