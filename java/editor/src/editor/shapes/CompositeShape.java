package editor.shapes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompositeShape implements Shape {

	private List<Shape> shapes;

	public CompositeShape() {
		shapes = new ArrayList<Shape>();
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}

	public void removeShape(Shape s) {
		shapes.remove(s);
	}

	public void draw(Graphics g) {
		for (Shape s : shapes) {
			s.draw(g);
		}
	}

	public void move(int dx, int dy) {
		for (Shape s : shapes) {
			s.move(dx, dy);
		}
	}

}
