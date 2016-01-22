package Display;

public class StringDisplay extends Display {
	/** 表示文字列 */
	private String str;
	
	/**
	 * @param str 表示文字列
	 */
	public StringDisplay(String str) {
		this.str = str;
	}
	
	/**
	 * @return int 文字数
	 */
	public int getColumns() {
		return str.getBytes().length;
	}
	
	/**
	 * @return int 行数は1
	 */
	public int getRows() {
		return 1;
	}
	
	/**
	 * @param int row
	 * @return rowが0のときのみ返す
	 */
	public String getRowText(int row) {
		if(row == 0) {
			return str;
		} else {
			return null;
		}
	}
}
