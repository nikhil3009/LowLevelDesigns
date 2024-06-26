public class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextProcessor;

    LogProcessor(LogProcessor processor){
        this.nextProcessor = processor;
    }

    public void log(int level, String message){
        if(nextProcessor != null){
            nextProcessor.log(level,message);
        }
    }
}
