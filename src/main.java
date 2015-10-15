import TemplateMethod.Example.*;

public class main {
	public static void main(String args[]) {
		AbstractDisplay dispChar = new CharDisplay('H');
		// サブクラスの実装は気にせずに、
		// display() を呼べばいい
		dispChar.display();
		
		AbstractDisplay dispStr = new StringDisplay("Hello, World!");
		dispStr.display();
	}
}
