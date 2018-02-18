package Expression;

import java.util.Hashtable;

public class VarFactory {
    private Hashtable table = new Hashtable();
    private static VarFactory varFactory = new VarFactory();

    private VarFactory() {}
    public static VarFactory getInstance() {
        return varFactory;
    }

    /** Typically would return an interface and make Variable a private nested class */
    public Variable makeVar(String name) {
        Object var = table.get(name);
        if(var != null)
            return (Variable)var;
        var = new Variable(name);
        table.put(name, var);
        return(Variable)var;
    }
}
