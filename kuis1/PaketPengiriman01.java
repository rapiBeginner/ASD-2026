
public class PaketPengiriman01 {
    String nomorResi;
    double berat, ongkosDasar;

    double totalOngkos() {
        double ongkos= berat*ongkosDasar;// total ongkos didapat dari ongkos dasar dikali dengan beratnya
        if (ongkos>100000) {
            ongkos-=(ongkos*0.1);//jika total ongkos diatas 100000, maka akan dikurangi sebanyak 10% dari total ongkos itu sendiri

        }
        return ongkos;// mengembalikan total ongkos kepada program yang memanggilnya
    }

    void printData(){// mencetak semua data
        System.out.println("Nomor Resi: "+nomorResi);
        System.out.println("Berat: "+berat);
        System.out.println("Ongkos dasar:"+ongkosDasar);
        System.out.println("Total ongkos : "+totalOngkos());
        System.out.println("=========================");
    }

}