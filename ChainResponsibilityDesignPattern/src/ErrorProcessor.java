public class ErrorProcessor extends LogProcessor {
    ErrorProcessor(LogProcessor processor){
        super(processor);
    }
    public void log(int level, String message){
        if(level == ERROR){
            System.out.println("info"+message);
        }
        else{
            super.log(level,message);
        }
    }
}
