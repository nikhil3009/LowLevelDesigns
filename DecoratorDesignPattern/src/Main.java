public class Main {
    public static void main(String[] args) {


        BasePizza pizza  = new ExtraBellpeppers(new ExtraChicken(new MargheritaPizza()));
        System.out.println("Total Cost:"+pizza.cost());
    }
}