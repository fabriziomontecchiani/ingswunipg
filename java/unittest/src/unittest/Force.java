package unittest;

public class Force {
	
	private double fx;
	private double fy;
	
	public Force(double fx, double fy) {
		this.fx = fx;
		this.fy = fy;
	}
	
	public double getFx() {
		return fx;
	}
	
	public double getFy() {
		return fy;
	}
	
	public void setFx(double fx) {
		this.fx = fx;
	}
	
	public void setFy(double fy) {
		this.fy = fy;
	}
	
	public void sum(Force f) {
		fx += f.getFx();
		fy += f.getFy();
	}
	
	public void multiplyBy(double scalar) {
		fx *= scalar;
		fy *= scalar;
	}
	
	public double abs() {
		return Math.sqrt(Math.pow(fx, 2)+Math.pow(fy, 2));
	}
}
