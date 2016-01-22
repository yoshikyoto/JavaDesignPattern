package Display;

public class SideBorder extends Border {
	/** 飾りとなる文字 */
	private char borderChar;
	
	/**
	 * @param display
	 * @param c
	 */
	public SideBorder(Display display, char c) {
		super(display);
		this.borderChar = c;
	}
	
	/**
	 * @return int 中身の文字数に飾り文字分を加えた長さ
	 */
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}
	
	/**
	 * @return int 中身の行数に同じ
	 */
	public int getRows() {
		return display.getRows();
	}
	
	/**
	 * @return 中身の指定行の両側に飾りをつけたもの
	 */
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}
}
