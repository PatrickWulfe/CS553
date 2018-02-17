public class Compound extends Statement {
    Statement[] statements;
    Compound(Statement... statements) {
        this.statements = statements;
    }

    void pp(int indent) {
        for(int i = 0; i < indent; i++)
            System.out.print("    ");
        System.out.println("begin");
        for(Statement s: statements)
            s.pp(indent + 1);
        for(int i = 0; i < indent; i++)
            System.out.print("    ");
        System.out.println("end");
    }
}
