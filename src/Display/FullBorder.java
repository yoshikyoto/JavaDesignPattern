package Display;

public class FullBorder extends Border {
	public FullBorder(Display display) {
		super(display);
	}
	
	/**
	 * @return int 中身の両側に左右の飾りを加えたもの
	 */
	public int getColumns() {
		return 1 + display.getColumns() +1;
	}
	
	/**
	 * @return int 行数は中身の行数に上下のも自分を加えたもの
	 */
	public int getRows() {
		return 1 + display.getRows() + 1;
	}
	
	public String getRowText(int row) {
		if(row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if(row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {
			return "|" + display.getRowText(row - 1) + "|";
		}
	}
	
	private String makeLine(char c, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(c);
		}
		return buf.toString();
	}
}
