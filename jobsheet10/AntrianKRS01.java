public class AntrianKRS01 {
       Mahasiswa01[] data;
    int front;
    int rear;
    int size;
    int max;
    int maxMhs;
    int done;

    public AntrianKRS01() {
        max = 10;
        data = new Mahasiswa01[10];
        size = 0;
        rear = -1;
        front = 0;
        maxMhs = 30;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. ");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            int next= (front+1)%max;
            if (data[next]!=null) {
                data[next].tampilkanData();
            }
        }
        
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = 1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void tambahAntrian(Mahasiswa01 mhs) {
        if (isFull()) {
            System.out.println("Antran penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    Mahasiswa01[] layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa01 mhs = data[front];
        front = (front + 1) % max;
        size--;
        done++;

        Mahasiswa01 mhs2 = null;
        if (!isEmpty()) {
            mhs2 = data[front];
            front = (front + 1) % max;
            size--;
            done++;
        }
        Mahasiswa01[] hasil = { mhs, mhs2 };
        return hasil;
    }

    int getJumlahAntrian() {
        return size;
    }
    int getJumlahSelesai(){
        return done;
    }

    int getBelumMelakukanKRS(){
        return maxMhs-done;
    }

}
