public class Calculator implements State{

    State state;
    State operand1;
    State operand2;
    State operator;
    State start;

    String stringOp1, stringOp2;

    int op1, op2, result;

    Calculator(){
        operand1 = new Operand1(this);
        operand2 = new Operand2(this);
        operator = new Operator(this);
        start = new Start(this);

        state = start;
    }



    @Override
    public void processDigit(int digit) {
        state.processDigit(digit);
    }

    @Override
    public void processArithmeticOperator(char ch) {
        state.processArithmeticOperator(ch);
    }

    @Override
    public void processEqualOperator() {
        state.processEqualOperator();
    }

    public void setOperateDigit(int digit){
        stringOp1 += digit;
    }

    public void changeToOperand1(){
        state = operand1;
    }

    public void changeToOperand2(){
        state = operand2;
    }

    public void changeToOperator(){
        state = operator;
    }

    public int getResult(){
        return result;
    }
}
