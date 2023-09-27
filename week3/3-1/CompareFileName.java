public class CompareFileName implements Comparable{

    public int compareTo(Object o1,Object o2){
        FileInfo f1 = (FileInfo) o1; //Object 타입으로 넘겨 받았기 때문에 형변환 해주면 데이터 사용 가능
        FileInfo f2 = (FileInfo) o2;

        return f1.getName().compareTo(f2.getName());// String 타입 비교는 compareTo


    }




}
