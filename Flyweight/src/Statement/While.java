package Statement;

import Expression.Expr;

public class While extends Statement{
    private Statement body;
    private Expr test;

    public While(Expr test, Statement body) {
        this.test = test;
        this.body = body;
    }

    public void print(java.io.PrintStream out, int indent) {
        for(int i = 0; i < indent; i++)
            out.print("    ");
        out.print("while (");
        test.print(out);
        out.println(") do");
        body.print(out, indent+1);
    }
}
