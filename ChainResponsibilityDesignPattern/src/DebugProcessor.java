public class DebugProcessor extends LogProcessor {
    DebugProcessor(LogProcessor processor){
        super(processor);
    }
    public void log(int level, String message){
        if(level == DEBUG){
            System.out.println("info"+message);
        }
        else{
            super.log(level,message);
        }
    }
}
