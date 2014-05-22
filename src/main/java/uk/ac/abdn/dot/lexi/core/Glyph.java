package uk.ac.abdn.dot.lexi.core;

import uk.ac.abdn.dot.lexi.core.iterator.Iterator;
import uk.ac.abdn.dot.lexi.core.visitor.GlyphVisitor;
import uk.ac.abdn.dot.lexi.gui.Window;

/**
 * Glyph abstract class represents a vitual "Glyph" component, 
 * may be a simple Character or a composite "Row" that
 * contains several Characters or Pictures. <br>
 * 
 * <b>NOTE</b>: There are two kinds of Glyph: <br>
 * 
 * <b>Basic Glyph</b> that only store the document data 
 * structure but no layout information, such as "Char", 
 * "Picture", "Paragraph". <br>
 * 
 * <b>Physical Glyph</b> that store the physical structure 
 * to display properly on the screen. They are dynamic and 
 * used to format the "Basic Glyph" for display, such as "column",
 * "Row", "Page".
 * 
 * @author Cheng Zeng
 */
public abstract class Glyph {
	
	/**
	 * Get the width of this glyph. 
	 * This is used to display. 
	 * 
	 * @return The width of this glyph (pixel).
	 */
	public abstract int boundsWidth();
	
	
	/**
	 * Get the height of this glyph. 
	 * This is used to display. 
	 * 
	 * @return The height of this glyph (pixel).
	 */
	public abstract int boundsHeight();
	
	/**
	 * Draw the glyph.
	 * 
	 * @param g The window context passed by the caller.
	 */
	public abstract void draw(Window w);
	
	/**
	 * Return whether a specific point intersects with the glyph.
	 * Whenever the user clicks somewhere in the document, lexi 
	 * calls this operator to determine which glyph or glyph 
	 * structure is under the mouse.
	 * 
	 * @param p - that point
	 */
	public abstract boolean intersects(Point p);
	
	/**
	 * Insert a glyph at a position specified by an integer index
	 * @param g - the glyph
	 * @param i - the index
	 */
	public abstract void insert(Glyph g, int i);

	/**
	 * Remove a specified glyph if it is indeed a child
	 * 
	 * @param g - the glyph
	 */
	public abstract void remove(Glyph g);
	
	/**
	 * Return the child (if any) at the given index
	 * 
	 * @param i - the index
	 * @return the child at the given index
	 */
	public abstract Glyph child(int i);
	
	/**
	 * Return this glyph's parent
	 * 
	 * @return Glyph
	 */
	public abstract Glyph parent();
	
	/**
	 * Create an iterator in order for the traversal on this glyph
	 * 
	 * @return an Iterator instance
	 */
	public abstract Iterator createIterator();
	
	/**
	 * Perform checking operation for this glyph
	 * @param gv - the GlyphVistor instance
	 */
	public abstract void checkMe(GlyphVisitor gv);
	
	
}
