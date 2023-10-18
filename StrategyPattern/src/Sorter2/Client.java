package Sorter2;

import Sorter2.Sorter2;

public class Client {

    public static void main(String[] args) {


        BubbleSortAlg bubbleSortAlg = new BubbleSortAlg();
        Sorter2 s2 = new Sorter2(bubbleSortAlg);
        int[] data ={5,4,13,1};
        s2.sort(data);



    }
}
