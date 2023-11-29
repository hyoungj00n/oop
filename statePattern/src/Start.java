public class Start implements State{

    Calculator calculator;

    public Start(Calculator calculator){
        this.calculator= calculator;
    }

    @Override
    public void processDigit(int digit) {
        calculator.processDigit(digit);
        calculator.setOperand1();
    }
}
