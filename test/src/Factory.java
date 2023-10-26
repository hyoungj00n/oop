import java.util.List;

public class Factory implements FactoryInterface{


    public ISeekAlg create(String name, int[] queue, int start){

        if (name.equals("SCAN")){
            return SCAN.getInstance();
        }
        else if(name.equals("FCFS")){
            return FCFS.getInstance();
        }
        else if(name.equals("SSTF")){
            return SSTF.getInstance();
        }

        return null;

    }
}
