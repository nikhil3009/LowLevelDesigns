import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int count) {
        this.diceCount = count;
    }

    public int rollDice(){
        int count = 0;
        int sum=0;

        while(count<=diceCount){
            count++;
            sum += ThreadLocalRandom.current().nextInt(min,max+1);
        }
        return sum;
    }





}
