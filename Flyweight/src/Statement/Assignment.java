package Statement;

import Expression.*;

public class Assignment extends Statement {
    Variable lvalue;
    Expr rvalue;

    public Assignment(Variable lvalue, Expr rvalue) {
        this.lvalue = lvalue;
        this.rvalue = rvalue;
    }
    public void print(java.io.PrintStream out, int indent) {
        for(int i = 0; i < indent; i++)
            out.print("    ");
        lvalue.print(out);
        out.print(" = ");
        rvalue.print(out);
        out.println();
    }
}
