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
}