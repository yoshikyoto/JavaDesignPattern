import java.io.*;

import Singleton.sample.*;

public class main {
	public static void main(String args[]) {
		System.out.println("Start");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) {
			System.out.println("同じインスタンスです");
		}
	}
}
