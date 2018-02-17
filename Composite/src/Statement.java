public abstract class Statement {
    final String name;
    Statement() { name = "state";}
    abstract void pp(int indent);
}
