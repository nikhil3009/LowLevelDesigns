public class InfoProcessor extends LogProcessor{
    InfoProcessor(LogProcessor processor){
        super(processor);
    }
    public void log(int level, String message){
        if(level == INFO){
            System.out.println("info"+message);
        }
        else{
            super.log(level,message);
        }
    }
}