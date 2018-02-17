import java.util.Random;
import java.util.Stack;


public class ObjectPool {
    static int constructed = 0;
    static int recycled = 0;
    static int held = 0;

    static Stack pool = new Stack();
    static Random rand = new Random();
    private ObjectPool() {}
    static List checkout() {
        if (pool.empty()) {
            pool.push(new List(rand.nextInt(1000), null));
            constructed++;
            System.out.println("Constructing");
        }
        else{
            recycled++;
            held--;
            System.out.println("Recycling");
        }
        return (List)pool.pop();
    }
    static void checkIn(List l) {
        held++;
        pool.push(l);
    }
    static void printDetails() {
        System.out.println("Constructed: " + constructed);
        System.out.println("Recycled: " + recycled);
        System.out.println("Held: " + held);
    }
}
