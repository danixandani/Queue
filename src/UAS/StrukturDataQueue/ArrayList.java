package UAS.StrukturDataQueue;
import java.util.NoSuchElementException;
public class ArrayList {

    private DataNama[] queue;
    private int depan;
    private int belakang;

    public ArrayList(int capacity) {
        queue = new DataNama[capacity];
    }
    public void add(DataNama dataNama){
        if(belakang == queue.length){
            DataNama[] newArray = new DataNama[2* queue.length];
            System.arraycopy(queue,0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[belakang] = dataNama;
        belakang++;
    }
    public DataNama remove(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        DataNama dataNama = queue[depan];
        queue[depan] = null;
        depan++;
        if (size() == 0){
            depan = 0;
            belakang = 0;
        }
        return dataNama;
    }
    public DataNama peek(){
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[depan];
    }
    public int size() {
        return belakang = depan;
    }
    public void printQueue() {
        for (int i = depan; i < belakang; i++) {
            System.out.println(queue[i]);
        }
    }
}
