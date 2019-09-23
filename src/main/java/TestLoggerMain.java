import java.io.IOException;

public class TestLoggerMain {

    public static void main(String args [])
    {
        try {
            testLog();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void testLog() throws IOException {
        LogRotationPolicy.createNewLogFileIfFileSizeIsExceeded();
        Logger.info("This is info log");
        Logger.error("This is error log", "error code 500");
        Logger.debug("This is debug log");
    }
}
