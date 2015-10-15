package TemplateMethod.Example;

public abstract class AbstractDisplay {
	protected abstract void open();
	protected abstract void print();
	protected abstract void close();
	
	/**
	 * open()して、5回 print()して、close()する
	 */
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
