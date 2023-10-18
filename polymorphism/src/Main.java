public class Main implements A{
    public void usePrint() {
        print();
    }

    public void print() {
        System.out.println("UseInterface");
    }

    public static void main(String[] args) {
        Main ui = new Main();
        ui.usePrint();
    }
}
