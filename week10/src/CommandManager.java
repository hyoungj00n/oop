import java.util.ArrayList;
import java.util.List;

public class CommandManager {

    List<Command> commands = new ArrayList<>();



    public void addOperation(Command op){
        commands.add(op);
    }

    public void performOperations(){

        for (Command command : commands){
            command.execute();
        }
    }
}
