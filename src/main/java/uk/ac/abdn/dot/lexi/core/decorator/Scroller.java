package uk.ac.abdn.dot.lexi.core.decorator;

import uk.ac.abdn.dot.lexi.core.Glyph;
import uk.ac.abdn.dot.lexi.core.Point;
import uk.ac.abdn.dot.lexi.core.iterator.Iterator;
import uk.ac.abdn.dot.lexi.core.visitor.GlyphVisitor;
import uk.ac.abdn.dot.lexi.gui.Window;

public class Scroller extends MonoGlyph{

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
