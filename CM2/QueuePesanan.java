public class QueuePesanan {
    NodePesanan head;
    NodePesanan tail;

    QueuePesanan() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void order(Pesanan dataPesanan) {
        NodePesanan newPesanan = new NodePesanan(dataPesanan);
        if (isEmpty()) {
            head = tail = newPesanan;
        } else {
            tail.next = newPesanan;
            newPesanan.prev = tail;
            tail = tail.next;
        }
        System.out.println(tail.data.dataPembeli.namaPembeli + " telah memesan " + tail.data.namaPesanan);
    }

    void reportOrder() {
        if (isEmpty()) {
            System.out.println("Pesanan masih kosong");
        } else {
            NodePesanan temp;
            NodePesanan barier = tail;
            while (head != barier) {
                temp = head;
                while (temp != barier.next) {
                    if (temp != barier && temp.data.namaPesanan.compareTo(temp.next.data.namaPesanan) > 0) {
                        Pesanan switchData = temp.data;
                        temp.data = temp.next.data;
                        temp.next.data = switchData;
                    }
                    temp = temp.next;
                }
                barier = barier.prev;
            }

            temp = head;
            System.out.printf("%-20s %-20s %-20s%n", "No Antrian", "Nama", "No HP");
            do {
                temp.data.tampilData();
                temp = temp.next;
            } while (temp != null);

        }
    }
}
