public class NodeRekap {
    Rekap data;
    NodeRekap next;
    NodeRekap prev;

    NodeRekap(Rekap dataRekap) {
        data = dataRekap;
        next = prev = null;
    }
}