public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {

    }
    public Singleton getSingleton() {
        return this.instance;
    }

}
