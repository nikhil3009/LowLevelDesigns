public class ExtraBellpeppers extends ToppingDecorator{
    BasePizza pizza;
    public ExtraBellpeppers(BasePizza pizza){
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 15;
    }
}
