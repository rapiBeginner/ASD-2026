public class BinaryTreeArray01 {
    Mahasiswa01[] data;
    int idxLast;

    public void populateData(Mahasiswa01[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);

            data[idxStart].tampilInformasi();

            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(Mahasiswa01 dataBaru) {
        if (idxLast < data.length - 1) {
            data[++idxLast] = dataBaru;
        } else {
            System.out.println("Array penuh!");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {

            data[idxStart].tampilInformasi();

            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}