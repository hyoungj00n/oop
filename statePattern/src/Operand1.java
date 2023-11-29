public class Operand1 implements State{
    Calculator calculator;

    public Operand1(Calculator calculator){
        this.calculator = calculator;

    }

    @Override
    public void processDigit(int digit) {
        calculator.setOperand1(digit);
    }

    @Override
    public void processArithmeticOperator(char ch) {
        calculator.setOperator(ch);
        calculator.changeToOperator();
    }
}
