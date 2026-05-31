public class Pesanan {
    int kodePesanan, harga;
    Pembeli dataPembeli;
    String namaPesanan;

    Pesanan(int a, String b, int c, Pembeli d) {
        kodePesanan = a;
        namaPesanan = b;
        harga = c;
        dataPembeli = d;
    }

    void tampilData() {
        System.out.printf("%-20d %-20s %-20d%n",kodePesanan, namaPesanan, harga);
    }
}
