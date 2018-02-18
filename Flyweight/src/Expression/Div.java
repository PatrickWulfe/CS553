package Expression;

public class Div implements Expr {
    private Expr left;
    private Expr right;

    public Div(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public void print(java.io.PrintStream out) {
        left.print(out);
        out.print(" / ");
        right.print(out);
    }
}