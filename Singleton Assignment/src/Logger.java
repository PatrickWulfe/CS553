import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Logger {
    private int verbosity;
    private String fileName;
    private static Logger myInstance = new Logger("logfile.txt", 1);
    private Logger(String fileName, int verbosity){
        this.fileName = fileName;
        this.verbosity = verbosity;
    }

    public void log(String logMessage) {

        // Set file and create if does not exist
        try {
            File logFile = new File(this.fileName);
            if(!logFile.exists()) {
                logFile.createNewFile();
            }

            // Append content to file
            FileWriter fw = new FileWriter(logFile, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            switch (this.verbosity) {
                case 0: bw.write("Desired: ");
                    break;
                case 1: bw.write("Important: ");
                    break;
                case 2: bw.write("Urgent: ");
                    break;
            }
            bw.write(logMessage);

            bw.close();

        }
        catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
    public static Logger getInstance() {
        if(myInstance == null)
            myInstance = new Logger("logfile.txt", 1);

        return myInstance;
    }
}
