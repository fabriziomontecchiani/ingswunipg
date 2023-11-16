package editor.canvas;

import editor.shapes.CompositeShape;
import editor.shapes.Shape;

public class Canvas extends CompositeShape{

	public void move(Shape s, int dx, int dy) {
		s.move(dx, dy);
	}
}
