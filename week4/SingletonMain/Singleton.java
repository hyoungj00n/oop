public class Singleton {

	//private static Singleton instance = new Singleton(); //규모가 커질수록 효율이 떨어진다.
	private volatile static Singleton instance;
	private Singleton() {
		System.out.println("Singleton constructor");
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {//이 부분이 locking하는 부분
				instance = new Singleton();
			}
        }
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton instance hashCode = " + instance.hashCode());
	}
}
