public class Start implements State{

    Calculator calc;

    Start(Calculator calc){
        this.calc = calc;
    }

    @Override
    public void processDigit(int digit) {
        calc.setOperateDigit(digit);
        calc.changeToOperand1();
    }
}
