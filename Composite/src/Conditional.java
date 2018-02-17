public class Conditional extends Statement{
    Expr exp;
    Statement st1;
    Statement st2;

    Conditional(Expr exp, Statement st1, Statement st2) {
        this.exp = exp;
        this.st1 = st1;
        this.st2 = st2;
    }

    void pp(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("    ");
        }
        System.out.println("if " + exp + " then");
        st1.pp(indent+1);
        for (int i = 0; i < indent; i++) {
            System.out.print("    ");
        }
        System.out.println("else");
        st2.pp(indent+1);
    }
}
