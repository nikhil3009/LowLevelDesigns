public class Expression implements ArthimeticExpression{
    ArthimeticExpression leftExpression;
    ArthimeticExpression rightExpression;
    Operations operation;

    public Expression(ArthimeticExpression leftExpression, ArthimeticExpression rightExpression, Operations operation){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    public int evaluate(){
        int value = 0;

        switch(operation){
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBSTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
        }
        System.out.println("Expression value is : " + value);
        return value;
    }



}
