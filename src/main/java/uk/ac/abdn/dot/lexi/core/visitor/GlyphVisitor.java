package uk.ac.abdn.dot.lexi.core.visitor;

import uk.ac.abdn.dot.lexi.core.Char;
import uk.ac.abdn.dot.lexi.core.Picture;
import uk.ac.abdn.dot.lexi.core.Row;


/**
 * The abstract defines the interface to check the content 
 * that are stored in Glyph objects
 * 
 * @author Cheng Zeng
 *
 */
public abstract class GlyphVisitor {
	
	/**
	 * Check the character
	 * 
	 * @param c - the Char instance
	 */
	public abstract void visitCharacter(Char c);
	
	/**
	 * Check the row
	 * 
	 * @param r - the Row instance
	 */
	public abstract void visitRow(Row r);
	
	/**
	 * Check the picture
	 * 
	 * @param p - the Picture instance
	 */
	public abstract void visitPic(Picture p);
	
}
