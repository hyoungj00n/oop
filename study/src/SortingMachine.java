public class SortingMachine {
    public static void main(String[] args) {

        ISortEngine sortEngine;
        SortEngineAdapter sortEngineAdapter = new SortEngineAdapter(new A_SortEngine(),new B_SortEngine());

        sortEngine = sortEngineAdapter;

        sortEngine.setList();
    }
}
