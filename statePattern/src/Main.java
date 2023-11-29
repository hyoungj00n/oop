import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);      // 키보드에서 한 글자 입력 받기
        while (ch != 'q' && ch != 'Q') {
            if(ch >=0 && ch <=9){
                c.processDigit(ch);
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                c.processArithmeticOperator(ch);
            }
            else if( ch == '='){
                c.processEqualOperator();
            }
            ch = sc.next().charAt(0);
        }
    }
}
