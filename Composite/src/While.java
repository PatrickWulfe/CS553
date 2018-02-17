public class While extends Statement{
    Expr exp;
    Statement st;

    While(Expr exp, Statement st) {
        this.exp = exp;
        this.st = st;
    }

    void pp(int indent) {
        for(int i = 0; i < indent; i++)
            System.out.print("    ");
        System.out.println("while " + exp + " do");
        st.pp(indent+1);
    }
}
