package UAS.StrukturDataQueue;

public class Main {
    public static void main(String[] args) {

    DataNama DaniAndani = new DataNama("Dani","Andani",1);
    DataNama AzisBanon = new DataNama("Azis","Banon",2);
    DataNama AbdulJapar = new DataNama("Abdul","Japar",3);

    ArrayList queue = new ArrayList(5);
    queue.add(DaniAndani);
    queue.add(AzisBanon);
    queue.add(AbdulJapar);

    //queue.remove();
    //queue.remove();
    //queue.remove();

    queue.printQueue();
    }
}
