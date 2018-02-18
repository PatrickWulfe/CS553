package Statement;

import Expression.Expr;

public class Conditional extends Statement{
    private Statement elseClause;
    private Expr test;
    private Statement thenClause;

    public Conditional(Expr test, Statement thenClause, Statement elseClause) {
        this.test = test;
        this.thenClause = thenClause;
        this.elseClause = elseClause;
    }

    public void print(java.io.PrintStream out, int indent) {
        for (int i = 0; i < indent; i++) {
            out.print("    ");
        }
        out.print("if ");
        test.print(out);
        out.println(" then");
        thenClause.print(out, indent+1);
        for (int i = 0; i < indent; i++) {
            out.print("    ");
        }
        out.println("else");
        elseClause.print(out, indent+1);
    }
}
