public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int level, String message){
        if(level == ERROR){
            System.out.println("Error"+message);
        }
        else {
            super.log(level,message);
        }
    }
}
