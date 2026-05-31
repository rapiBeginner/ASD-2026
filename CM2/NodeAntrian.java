public class NodeAntrian {
    Pembeli data;
    NodeAntrian next,prev;
    int queueNumber;

    NodeAntrian(Pembeli dataPembeli, int number){
        data=dataPembeli;
        queueNumber=number;
    }
}
