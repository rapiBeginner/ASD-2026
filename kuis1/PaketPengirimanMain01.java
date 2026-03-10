import java.util.Scanner;

public class PaketPengirimanMain01 {
    public static void main(String[] args) {
        Scanner raffi= new Scanner(System.in);
        System.out.print("Masukkan jumlah paket: ");
        PaketPengiriman01 n[]= new PaketPengiriman01[raffi.nextInt()];//jumlah data paket (dalam hal ini panjang array objectnya) ditentukan oleh input user
        raffi.nextLine();
        for (int i = 0; i < n.length; i++) {//Perulangan untuk memasukkan semua data paket satu persatu sesuai jumlah yang ditentukan user pada awal program
            n[i]=new PaketPengiriman01();
            System.out.print("Masukkan nomor resi: ");
            n[i].nomorResi=raffi.nextLine();
            System.out.print("Masukkan berat: ");
            n[i].berat=raffi.nextDouble();
            System.out.print("Masukkan ongkos dasar: ");
            n[i].ongkosDasar=raffi.nextDouble();
            raffi.nextLine();
            System.out.println("==================");
        }
        int jumlahLebih10kg=0;// menampung jumlah paket yang beratnya lebih dari 10kg
        double ongkosLebih10kg=0;// menampung total ongkos semua paket yang beratnya lebih dari 10kg
        System.out.println("\n====PRINT DATA====");
        for (PaketPengiriman01 paketPengiriman01 : n) {//perulangan untuk menampilkan data seluruh paket
            if (paketPengiriman01.berat>10) {//ketika sebuah paket beratnya lebih dari 10kg, jumlahLebih10kg ditambah 1(counter), dan ongkosLebih10kg ditambahkan dengan total ongkos paket tersebut 
                jumlahLebih10kg++;
                ongkosLebih10kg+=paketPengiriman01.totalOngkos();
            }
            paketPengiriman01.printData();//Mencetak data setiap paket
        }
        double presentaseLebih10kg= jumlahLebih10kg*100/n.length;//menghitung presentase paket yang beratnya lebih dari 10kg, dengan cara mengkalikan jumlahnya, lalu membaginya dengan jumlah seluruh paket (panjang array)
        double rata2ongkos10kg= ongkosLebih10kg/jumlahLebih10kg;//menghitung rata2 ongkos paket yang lebih dari 10kg, dengan membagi total ongkos paket diatas 10kg dengan jumlahnya
        System.out.println("Presentase yang lebih dari 10kg= "+presentaseLebih10kg+"%");
        System.out.println("Rata-rata ongkos diatas 10kg= "+rata2ongkos10kg);
        raffi.close();
    }
}
