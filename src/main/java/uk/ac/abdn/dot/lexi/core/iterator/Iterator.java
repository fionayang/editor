package uk.ac.abdn.dot.lexi.core.iterator;

import uk.ac.abdn.dot.lexi.core.Glyph;


/**
 * Iterator abstract class defines the interface for the traversal of Glyph instances 
 * 
 * @author cheng
 */
public abstract class Iterator {
	
	/**
	 * Get the first item 
	 * 
	 * @return
	 */
	public abstract Glyph first();
	
	
	/**
	 * Get next item
	 * 
	 * @return
	 */
	public abstract Glyph next();
	
	/**
	 * Check if it is ended
	 * 
	 * @return
	 */
	public abstract boolean isDone();
	
	/**
	 * Get the current item
	 * 
	 * @return
	 */
	public abstract Glyph currentItem();
	
	

}
