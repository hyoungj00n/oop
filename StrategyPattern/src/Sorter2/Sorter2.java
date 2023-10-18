package Sorter2;

public class Sorter2 {
    Strategy2 s2;

    Sorter2(Strategy2 s2){
        this.s2 = s2;
    }

    void setSorter(Strategy2 s2){
        this.s2 = s2;
    }

    void sort(int[] data){
        s2.sortAlg(data);
    }
}
