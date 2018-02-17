/** Class for creating the factories to improve the main class from 2.1.2 */

public class AbstractFactoryCreator {
    /** Ints for ranges of factories */
    private int lowerBoundary = 1000;
    private int ecoBoundary = 5000;
    private int stdBoundary = 8000;
    private int proBoundary = 9999;

    private static AbstractFactoryCreator afc = new AbstractFactoryCreator();

    private AbstractFactoryCreator() {}

    public static AbstractFactoryCreator getAfc() { return afc; }

    public AbstractFactoryIF createAbstractFactory(int loginId) {
        if(lowerBoundary < loginId && loginId<= ecoBoundary)
            return new AbstractFactoryEconomy();
        if(loginId <= stdBoundary)
            return new AbstractFactoryStd();
        if(loginId <= proBoundary)
            return new AbstractFactoryPro();
        System.err.println ("Argument out of range");
        System.exit (1);
        return null;
    }
}
