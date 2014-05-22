package uk.ac.abdn.dot.lexi.gui.factory;

import uk.ac.abdn.dot.lexi.gui.Button;
import uk.ac.abdn.dot.lexi.gui.Menu;
import uk.ac.abdn.dot.lexi.gui.ScrollBar;
/**
 * 
 * GUIFactory abstract class defines the interface for abstract 
 * factories for different systems such as MotifFactory, PMFactory 
 * and MacFactory.
 * 
 * @author Cheng Zeng
 *
 */
public abstract class GUIFactory {
	
	/**
	 * Create the scroll bar
	 * 
	 * @return
	 */
	public abstract ScrollBar createScrollBar();

	/**
	 * Create the button
	 * 
	 * @return
	 */
	public abstract Button createButton();
	
	/**
	 * Create the menu
	 * 
	 * @return
	 */
	public abstract Menu createMenu();
}
