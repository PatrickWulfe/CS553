package Statement;

public class Compound extends Statement {
    Statement[] body;

    public Compound(Statement stmt0, Statement stmt1) {
        body = new Statement[2];
        body[0] = stmt0;
        body[1] = stmt1;
    }
    public Compound(Statement[] body) {
        this.body = body;
    }

    public void print(java.io.PrintStream out, int indent) {
        for(int i = 0; i < indent; i++)
            out.print("    ");
        out.println("begin");
        for(Statement s: body)
            s.print(out,indent + 1);
        for(int i = 0; i < indent; i++)
            out.print("    ");
        out.println("end");
    }
}
