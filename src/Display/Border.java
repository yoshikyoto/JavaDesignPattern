package Display;

public abstract class Border extends Display {
	/** この枠がくるんでいる中身 */
	protected Display display;
	
	/**
	 * @param Display display
	 */
	protected Border(Display display) {
		this.display = display;
	}
}
