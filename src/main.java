import TemplateMethod.Example.*;

public class main {
	public static void main(String args[]) {
		AbstractDisplay dispChar = new CharDisplay('H');
		dispChar.display();
		
		AbstractDisplay dispStr = new StringDisplay("Hello, World!");
		dispStr.display();
	}
}
