import Expression.*;
import Statement.*;

public class Driver_nonFW {
    /** Usual entry point. Constructs and pretty prints an example program. */
    public static void main (String [] arg) {
        Statement factorial = new Compound (
                new Assignment (new Variable("fact"), new Variable("1")),
                new While (new Gt (new Variable("n"),
                        new Variable("1")), new Compound (
                        new Assignment (new Variable("fact"),
                                new Mul (new Variable("fact"),
                                        new Variable("n"))),
                        new Assignment (new Variable("n"),
                                new Sub (new Variable("n"),
                                        new Variable("1"))))));
        factorial.print (System.out, 0);
        System.out.println ();
    }
}
