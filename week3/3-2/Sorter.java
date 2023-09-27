public class Sorter implements SortAlg{
    private SortAlg sortAlg;

    Sorter(SortAlg sortAlg){
        this.sortAlg = sortAlg;
    }

    public void setSortAlg(SortAlg sortAlg){
        this.sortAlg = sortAlg;
    }

    public void sort(int[] data){
        sortAlg.sort(data);
    }

}
