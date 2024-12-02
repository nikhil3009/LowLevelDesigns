public class ExtraChicken extends ToppingDecorator{
 BasePizza pizza;
 public ExtraChicken(BasePizza pizza){
    this.pizza = pizza;
}
    @Override
    public int cost() {
        return pizza.cost()+ 30;
    }
}
