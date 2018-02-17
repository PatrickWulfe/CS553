import java.util.Random;

public class Client {
    public static void main (String[] ignore) {
        Random rand = new Random();
        List head = new List(1,null);
        List current = head;
        List temp = null;

        for(int i=0; i<5000000; i++) {
            if(rand.nextInt(2) == 0) {
                temp = ObjectPool.checkout();
                if(head == null)
                    head = temp;
                current.list = temp;
                current = temp;
            }
            else {
                if(head!=null) {
                    temp = head;
                    head = head.list;
                    ObjectPool.checkIn(temp);
                }
            }
        }
        ObjectPool.printDetails();
    }
}
