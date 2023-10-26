public class FCFS implements ISeekAlg{

    private volatile static FCFS instance;
    private FCFS() {

    }

    public static FCFS getInstance() {
        if (instance == null) {
            synchronized (FCFS.class) {//이 부분이 locking하는 부분
                instance = new FCFS();
            }
        }
        return instance;
    }
    public void execute(int[] queue, int start) {
        // 순서대로 이동
        int[] tempQueue = new int[queue.length];

        for (int i = 0; i < queue.length; i++) {
            tempQueue[i] = queue[i];
        }
        for (int i = 0; i < tempQueue.length; i++) {
            System.out.printf("%d ", tempQueue[i]);
        }
        System.out.printf("\n");
    }
}
