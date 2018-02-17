public class Driver {
    public static void main(String [] ignore) {
        Logger myLogger = Logger.getInstance();

        myLogger.log("This is the first log message.");
        myLogger.log("This is another log message.");
        myLogger.log("These log messages could go on forever.");
        myLogger.log("This could be the last log message.");
        myLogger.log("Turns out that wasn't the last log message.");
        myLogger.log("And neither was that one.");
        myLogger.log("This is the last log message.");
        myLogger.log("Just kidding.");
    }
}
