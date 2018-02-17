public class Assignment extends Statement {
    String var;
    Expr exp;
    Assignment(String var, Expr exp) {
        this.var = var;
        this.exp = exp;
    }
    void pp(int indent) {
        for(int i = 0; i < indent; i++)
            System.out.print("    ");
        System.out.println(var + " := " + exp);
    }
}
