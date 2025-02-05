public class Main {
    public static void main(String[] args) {

        ArthimeticExpression three = new Number(2);
        ArthimeticExpression six = new Number(6);
        ArthimeticExpression eight = new Number(8);
        ArthimeticExpression addition = new Expression(six,eight,Operations.ADD);
        ArthimeticExpression parent = new Expression(three,addition,Operations.MULTIPLY);
        parent.evaluate();
    }
}