package Singleton.sample;

public class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		System.out.println("インスタンスを作成しました");
	}
	public static Singleton getInstance() {
		return s;
	}
}
