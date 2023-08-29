package editor.shapes;

import java.awt.Graphics;

public class Rectangle extends PrimitiveShape {

	private int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);

	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
