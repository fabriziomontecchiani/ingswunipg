package editor.shapes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image extends PrimitiveShape {

	int x, y;
	String path;
	BufferedImage img;

	public Image(String path, int x, int y) {
		this.path = path;
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		try {
			loadImage();
			drawImage(g);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private void loadImage() throws IOException {
		if (img == null)
			img = ImageIO.read(ClassLoader.getSystemResource(path));
	}

	private void drawImage(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
