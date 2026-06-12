public class LinkedListRekapAntrian {
    NodeRekap head, tail;

    LinkedListRekapAntrian() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void add(Rekap dataRekap) {
        if (isEmpty()) {//Jika kosong, langsung masukkan saja node baru ke antrian
            NodeRekap nodeBaru = new NodeRekap(dataRekap);
            head = tail = nodeBaru;
        } else {
            NodeRekap temp = head;
            do {
                if (temp.data.jamAntri == dataRekap.jamAntri) {//mencari apakah data dengan jam yang sama sudah ada di antrian
                    break;
                }
                temp = temp.next;
            } while (temp != null);

            if (temp == null) {//jika tidak ada data dengan jam yang sama, maka node baru ditambahkan di akhir
                NodeRekap nodeBaru = new NodeRekap(dataRekap);
                tail.next = nodeBaru;
                nodeBaru.prev = tail;
                tail = nodeBaru;
            } else {// jika ternyata data dengan jam yang sama ditemukan dalam rekap, maka jumlahnya
                    // ditambah 1
                temp.data.jumlah += 1;
            }
        }
    }

    void printRekap() {
        if (isEmpty()) {
            System.out.println("Rekap antrian masih kosong");//jika antrian kosong beri keterangan
        } else {
            NodeRekap temp = head;
            int terbanyak = 0;
            while (temp != null) {
                if (temp.data.jumlah > terbanyak) {//mencari jumlah antrian paling banyak
                    terbanyak = temp.data.jumlah;
                }
                temp = temp.next;
            }

            System.out.printf("%-20s %-20s%n", "Jam Antri", "Jumlah");

            temp = head;
            do {
                if (temp.data.jumlah == terbanyak) {//tampilkan data dengan jumlah antrian paling banyak saja
                    temp.data.tampilData();
                }
                temp = temp.next;
            } while (temp != null);
        }
    }

}
