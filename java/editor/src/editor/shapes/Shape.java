package editor.shapes;

import java.awt.Graphics;

public interface Shape {

	public void addShape(Shape s);

	public void removeShape(Shape s);

	public void draw(Graphics g);

	public void move(int dx, int dy);

}
