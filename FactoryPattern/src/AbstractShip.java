public abstract class AbstractShip {

    protected String name;
    protected int capacity;

    @Override
    public String toString(){
        return String.format("이름: "+name  + " 용량: " +capacity );
    }




}
