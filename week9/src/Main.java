import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);      // 키보드에서 한 글자 입력 받기
        while (ch != 'q' && ch != 'Q') {
            if (ch >= '0' && ch <= '9'){
                calc.processDigit(ch-'0');
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                calc.processArithmeticOperator(ch);
            }
            else if (ch == '='){
                calc.processEqualOperator();
                System.out.println(calc.getResult());
            }





            ch = sc.next().charAt(0);
        }
    }
}
