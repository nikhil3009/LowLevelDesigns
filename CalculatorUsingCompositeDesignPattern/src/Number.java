public class Number implements ArthimeticExpression{
    int value;
    public Number(int value){
        this.value = value;
    }

    public int evaluate(){
        System.out.println("the number is " + value);
        return value;
    }


}
