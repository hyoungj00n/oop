import java.util.List;

public class SeekMain {
    public static void main(String[] args) {
        int[] queue = { 70,  153,  24,  57,  140,  15,  115,  80, 85 };
        int start = 43;


        List<String> list;
        LoadSeekAlgInterface loadAlgs = new LoadSeekAlgModules("algs.txt");
        list = loadAlgs.load();



        // 디버깅 목적. algs.txt파일의 내용을 확인하고 싶으면 다음 네 줄의 코드를 주석에서 해제할 것
/*        System.out.printf("algs.size() = %d\n", list.size());
        for (String s : list) {
            System.out.println(s);
        }
*/
        FactoryInterface factory = new Factory();
        for (String algName : list) {
            System.out.println(algName + " 알고리즘으로 처리");


            ISeekAlg seekAlg = factory.create(algName,queue,start);

            if (algName.equals("SCAN")) {
                seekAlg.execute(queue, start);
            }
            if (algName.equals("FCFS")) {
                seekAlg.execute(queue,start);
            }
            else if (algName.equals("SSTF")) {
                seekAlg.execute(queue,start);
            }

        }
    }
}