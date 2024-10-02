public class Main {
    public static void main(String[] args) {

        LogProcessor obj = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));
        obj.log(LogProcessor.ERROR,"exception");
        obj.log(LogProcessor.INFO,"info");
        obj.log(LogProcessor.DEBUG,"Debug");
        obj.log(4,"Debug");


    }
}