package Display;

public abstract class Display {
	/**
	 * 横の文字数を得る
	 *  
	 * @return int
	 */
	public abstract int getColumns();
	
	/**
	 * 縦の行数を得る
	 * 
	 * @return int
	 */
	public abstract int getRows();
	
	/** 
	 * row番目の文字列を得る
	 * 
	 * @param int row
	 * @return String
	 */
	public abstract String getRowText(int row);
	
	/**
	 * 全部表示する
	 */
	public final void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
