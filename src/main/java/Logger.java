import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    public static void  info(String infoMsg) throws IOException {
        String lineToWrite = "INFO:" + infoMsg;

        writeToFile(lineToWrite, LogRotationPolicy.fileName);
    }
    public static void error(String error, String errorCode) throws IOException {
        String lineToWrite = "ERROR: " + error + " ERRORCODE: " + errorCode;
        writeToFile(lineToWrite, LogRotationPolicy.fileName);
    }

    public static void debug(String debugInfo) throws IOException {
        writeToFile("DEBUG:" + debugInfo, LogRotationPolicy.fileName);
    }

    private static void writeToFile(String msg,String filePath) throws IOException {

        BufferedWriter writer = new BufferedWriter(
                new FileWriter( filePath, true)  //Set true for append mode
        );
        writer.newLine();   //Add new line
        writer.write(msg);
        writer.close();


    }
}
