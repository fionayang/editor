package uk.ac.abdn.dot.lexi.core.compositor;

import uk.ac.abdn.dot.lexi.core.Row;


/**
 * 
 * Compositor defines the interface for the strategies to compose 
 * basic Glyph instance and its children
 * 
 * @author cheng
 *
 */
public interface Compositor {
	
	/**
	 * Execute the composing operation
	 * 
	 */
	public void compose();
	
	/**
	 * Set the row
	 * 
	 * @param r
	 */
	public void setComposition(Row r);

}
