package Expression;

public class Gt implements Expr {
    private Expr left;
    private Expr right;

    public Gt(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public void print(java.io.PrintStream out) {
        left.print(out);
        out.print(" > ");
        right.print(out);
    }
}