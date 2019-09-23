import java.io.File;

public class LogRotationPolicy {
    static int logFileCount = 1;
    static final String basePath = "c:/temp/";
    static  String fileName = basePath + "log1.txt";

    static final double fileSizeMax = 0.000001;
    public static void createNewLogFileIfFileSizeIsExceeded()
    {
        File f = new File(fileName);
        if(getFileSizeInMegaBytes(f) > fileSizeMax) {
            logFileCount += 1;
            fileName = basePath + "log" + logFileCount + ".txt";
        }
    }

    private static double getFileSizeInMegaBytes(File f)
    {
        return (double) f.length()/(1024*1024);
    }
}
