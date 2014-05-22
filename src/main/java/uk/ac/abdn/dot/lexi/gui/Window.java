package uk.ac.abdn.dot.lexi.gui;

/**
 * Window abstract class defines the interface for all windows 
 * that are shown by the user interface
 * 
 * 
 * @author Cheng Zeng
 */
public abstract class Window {
	
	private WindowImp windowImp;
	
	/**
	 * Redraw the window
	 * 
	 */
	public abstract void redraw();
	
	/**
	 * Iconify the window
	 * 
	 */
	public abstract void iconify();
	
	/**
	 * Lower
	 * 
	 */
	public abstract void lower();
	
	/**
	 * Raise
	 * 
	 */
	public abstract void raise();
	
	/**
	 * Draw line
	 * 
	 */
	public abstract void drawLine();
	
	/**
	 * Draw rectangle
	 * 
	 */
	public abstract void drawRect();

}
