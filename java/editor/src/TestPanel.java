import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import editor.canvas.Canvas;
import editor.shapes.Circle;
import editor.shapes.CompositeShape;
import editor.shapes.Image;
import editor.shapes.Rectangle;
import editor.shapes.Shape;

public class TestPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		Canvas canvas = new Canvas();
		Shape r = new Rectangle(1, 1, 100, 100);
		Shape c = new Circle(200, 200, 50);
		Shape cs = new CompositeShape();
		cs.addShape(r);
		cs.addShape(c);
		canvas.addShape(cs);
		canvas.move(cs, 200, 200);
		
		Shape i = new Image("java.jpg", 500, 500);
		canvas.addShape(i);

		g.setColor(Color.red);
		canvas.draw(g);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		TestPanel p = new TestPanel();
		p.setSize(1000, 1000);
		f.add(p);
		f.setSize(1000, 1000);
		f.setLayout(null);
		f.setVisible(true);
	}

}
