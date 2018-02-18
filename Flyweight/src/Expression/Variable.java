package Expression;

public class Variable implements Expr {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public void print(java.io.PrintStream out) {
        out.print(name);
    }
}
