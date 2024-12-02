public class Main {
    public static void main(String[] args) {
        LogProcessor obj = new InfoLogProcessor(new DebugLogProcessot(new ErrorLogProcessor(null)));
        obj.log(LogProcessor.DEBUG," Debugger");
        obj.log(LogProcessor.ERROR," Error");

    }
}