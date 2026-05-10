public class AntrianLayanan01 {
    Mahasiswa01[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan01(int max) {
        this.max = max;
        data = new Mahasiswa01[max];
        size = 0;
        rear = -1;
        front = 0;
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
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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

    Mahasiswa01 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa01 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    int getJumlahAntrian(){
        return size;
    }

}
