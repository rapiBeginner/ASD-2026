public class Pembeli {
    String namaPembeli, NoHp;

    Pembeli(String b, String c) {
        namaPembeli = b;
        NoHp = c;
    }

    void tampilData() {
        System.out.printf("%-20s %-20s%n", namaPembeli, NoHp);
    }
}
