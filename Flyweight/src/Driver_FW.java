import Expression.*;
import Statement.*;

public class Driver_FW {
    /** Usual entry point. Constructs and pretty prints an example program. */
    public static void main (String [] arg) {

        /** Uses VarFactory(Flyweight) to create/reuse variables instead of new */
        VarFactory varFactory = VarFactory.getInstance();
        Statement factorial = new Compound (
                new Assignment (varFactory.makeVar("fact"), varFactory.makeVar("1")),
                new While (new Gt (varFactory.makeVar("n"),
                        varFactory.makeVar("1")), new Compound (
                        new Assignment (varFactory.makeVar("fact"),
                                new Mul (varFactory.makeVar("fact"),
                                        varFactory.makeVar("n"))),
                        new Assignment (varFactory.makeVar("n"),
                                new Sub (varFactory.makeVar("n"),
                                        varFactory.makeVar("1"))))));
        factorial.print (System.out, 0);
        System.out.println ();
    }
}
