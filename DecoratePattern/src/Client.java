public class Client {
    public static void main(String[] args) {
        ComponentI c = new Component();

        ComponentI cc = new Decorator1(c);
    
    }
}
