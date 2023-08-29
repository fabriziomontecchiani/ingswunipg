package editor.shapes;

import java.awt.Graphics;

public class Circle extends PrimitiveShape {

	int cx, cy, radius;

	public Circle(int cx, int cy, int radius) {
		this.cx = cx;
		this.cy = cy;
		this.radius = radius;
	}

	public void draw(Graphics g) {
		g.drawOval(cx - radius / 2, cy - radius / 2, radius, radius);
		g.fillOval(cx - radius / 2, cy - radius / 2, radius, radius);
	}

	public void move(int dx, int dy) {
		cx += dx;
		cy += dy;
	}

}
