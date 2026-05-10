import java.util.Scanner;

public class QueueMain01 {
    static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peak");
        System.out.println("5. Clear");
        System.out.println("--------------");

    }

    public static void main(String[] args) {

        Scanner raffi = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = raffi.nextInt();
        Queue01 Q = new Queue01(n);
        int pilih;
        do {
            menu();
            pilih = raffi.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = raffi.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peak();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilih >= 1 && pilih <= 5);
    }

}
