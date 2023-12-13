public class SortEngineAdapter implements ISortEngine{

    A_SortEngine a;
    B_SortEngine b;

    public SortEngineAdapter(A_SortEngine a,B_SortEngine b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void setList() {
        b.setList();
    }

    @Override
    public void printSortList() {
        a.printSortList();
    }

    @Override
    public void sort() {
        b.sorting(false);
    }

    @Override
    public void reverseSort() {
        b.sorting(true);
    }
}
