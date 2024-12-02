public class DebugLogProcessot extends LogProcessor{
    DebugLogProcessot(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int level, String message){
        if(level == DEBUG){
            System.out.println("Debug"+message);
        }
        else {
            super.log(level,message);
        }
    }
}
