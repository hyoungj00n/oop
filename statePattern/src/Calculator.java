public class Calculator implements State{

    State operator;
    State operand1;
    State operand2;
    State state;

    State start;

    String stringOp1;
    String stringOp2;

    char op;

    int op1, op2, result;

    public Calculator(){
        start = new Start(this);
        operand1 = new Operand1(this);
        operand2 = new Operand2(this);
        operator = new Operator(this);
        state = start;
        init();

    }

    public void changeToOperand1(){ state = operand1;}
    public void changeToOperand2(){ state = operand2;}
    public void changeToOperator(){ state = operator;}

    public void setOperand1(int digit){stringOp1 += digit;}
    public void setOperator(char ch){op = ch;}
    public void setOperand2(int digit){stringOp2 += digit;}
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



    public void init(){
        stringOp1 ="";
        stringOp2 = "";
    }
}
