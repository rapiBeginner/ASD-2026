import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa01 {
    List<Mahasiswa01> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa01... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa01 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String nim) {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
        Mahasiswa01 key = new Mahasiswa01(nim, "", "");
        return Collections.binarySearch(mahasiswas, key, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortAscending() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortDescending() {
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa01 lm = new ListMahasiswa01();
        Mahasiswa01 m = new Mahasiswa01("201234", "Noureen", "021xx1");
        Mahasiswa01 m1 = new Mahasiswa01("201235", "Akhleema", "021xx2");
        Mahasiswa01 m2 = new Mahasiswa01("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        
        System.out.println("");
        lm.update(lm.linearSearch("201235"), new Mahasiswa01("201235", "Akhleema Lela", "021xx2"));
        lm.tampil();
    }
}