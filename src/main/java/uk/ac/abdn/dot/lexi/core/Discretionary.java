package uk.ac.abdn.dot.lexi.core;

import uk.ac.abdn.dot.lexi.core.iterator.Iterator;
import uk.ac.abdn.dot.lexi.core.visitor.GlyphVisitor;
import uk.ac.abdn.dot.lexi.gui.Window;

/**
 * Discretionary class is a class for hyphenation
 * 
 * @author Cheng Zeng
 *
 */
public class Discretionary extends Glyph{

	@Override
	public int boundsWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int boundsHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw(Window w) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean intersects(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void insert(Glyph g, int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Glyph g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Glyph child(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Glyph parent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void checkMe(GlyphVisitor gv) {
		// TODO Auto-generated method stub
		
	}

}
