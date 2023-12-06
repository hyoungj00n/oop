public class Main {
    public static void main(String[] args) {


        CommandManager c = new CommandManager();
        Command c1 = new AddValueCommand(1, 2);
        c.addOperation(c1);
    }
}
