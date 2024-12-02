import Adaptee.WeightImpl;
import Adapter.ConvertedWeight;
import Adapter.ConvertedWeightImpl;

public class Main {
    public static void main(String[] args) {
        ConvertedWeight obj = new ConvertedWeightImpl(new WeightImpl());
        System.out.println(obj.getWeightInKgs());
    }
}