import Display.*;

public class main {
	public static void main(String args[]) {
		// ただのテキスト
		Display b1 = new StringDisplay("Hello World");
		b1.show();
		// 両端に#をつける
		Display b2 = new SideBorder(b1, '#');
		b2.show();
		// さらに枠で囲う
		Display b3 = new FullBorder(b2);
		b3.show();
		// 更にデコレーションしまくれる
		Display b4 = new FullBorder(b3);
		Display b5 = new SideBorder(b4, '*');
		Display b6 = new FullBorder(b5);
		Display b7 = new SideBorder(b6, '/');
		b7.show();
	}
}
