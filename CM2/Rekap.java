public class Rekap {
    int jamAntri;
    int jumlah = 1;//beri nilai default 1 pada setiap rekap

    Rekap(int jam) {
        this.jamAntri = jam;
    }

    void tampilData() {
        System.out.printf("%-20d %-20d%n", jamAntri, jumlah);
    }
}
