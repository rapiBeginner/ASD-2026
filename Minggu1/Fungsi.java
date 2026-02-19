import java.util.Locale;

public class Fungsi {
    static int stok[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    static String[] bunga = {
            "Aglonema",
            "Keladi",
            "\tAlocasia",
            "Mawar"
    };

    static int harga[] = {
            75000, 50000, 60000, 10000
    };

    public static void tampilPendapatan() {
        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }
            String status = totalPendapatan > 1500000 ? "Sangat Baik" : "Perlu evaluasi";
            System.out.println("Total pendapatan RoyalGarder" + (i + 1) + ": "
                    + String.format(Locale.GERMAN, "%,d", totalPendapatan) + " (" + status + ")");
        }
    }

    public static void tampilTabel() {
        System.out.print("\t\t");
        for (int i = 0; i < bunga.length; i++) {
            System.out.print(bunga[i] + "\t");
        }
        System.out.print("\n");
        for (int i = 0; i < stok.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + "\t");
            for (int j = 0; j < stok[i].length; j++) {
                System.out.print(stok[i][j] + "\t\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        tampilTabel();
        tampilPendapatan();
    }
}
