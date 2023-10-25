public class Main {

    public static void main(String[] args) {
        ISubject subject1 = new Subject1();

        subject1.registerObserver(new Observer1());

        subject1.notifyObservers();
    }
}
