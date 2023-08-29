package editor.canvas;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import editor.shapes.CompositeShape;
import editor.shapes.Shape;

public class Canvas extends CompositeShape{

	private List<Shape> shapes;

	public Canvas() {
		shapes = new ArrayList<Shape>();
	}

	public void draw(Graphics g) {
		for (Shape s : shapes)
			s.draw(g);
	}

	public void move(Shape s, int dx, int dy) {
		s.move(dx, dy);
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}

	public void removeShape(Shape s) {
		shapes.remove(s);
	}
}
