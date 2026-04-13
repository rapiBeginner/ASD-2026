package Praktikum5.Tugas;

public class DataDosen01 {
    Dosen01[] dataDosen = new Dosen01[10];
    int idx;

    void tambah(Dosen01 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan\n");
        } else {
            System.out.println("Data dosen sudah penuh\n");
        }
    }

    void tampil() {
        System.out.println("====DATA DOSEN====");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
        System.out.println();
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen01 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIndex].usia) {
                    maxIndex = j;
                }
            }

            Dosen01 temp = dataDosen[i];
            dataDosen[i] = dataDosen[maxIndex];
            dataDosen[maxIndex] = temp;
        }
    }

    void insertionSortDESC() {
        for (int i = 1; i < idx; i++) {
            Dosen01 temp = dataDosen[i];
            int j = i;

            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }

            dataDosen[j] = temp;
        }
    }

}
