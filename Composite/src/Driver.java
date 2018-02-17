public class Driver {
    public static void main(String[] ignore) {
        Statement factorial = new Compound (
                new Assignment ("fact", new Expr ()),
                new While (new Expr (), new Compound (
                        new Assignment ("fact", new Expr ()),
                        new Assignment ("n", new Expr ()))));

        factorial.pp(0);
    }
}
