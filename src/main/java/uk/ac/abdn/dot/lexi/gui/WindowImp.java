package uk.ac.abdn.dot.lexi.gui;

/**
 * 
 * WindowImpl abstract class defines the interface for the different window systems, 
 * such as Mac, PM or XWindow.
 * 
 * @author Cheng Zeng
 *
 */
public abstract class WindowImp {

	/**
	 * Raise windows
	 * 
	 */
	public abstract void deviceRaise();
	
	/**
	 * Draw rectangles
	 * 
	 */
	public abstract void deviceRect();
	
}
