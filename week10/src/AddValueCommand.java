public class AddValueCommand implements Command{

    int x,y;
    AddValueCommand(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int execute(){
        return x+y;
    }
}
