package OOPExample2;

public class Colour implements Pallitra{
	
	private int r;
	private int g;
	private int b;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Colour(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public int zindex() {
		return r*10 + g/6 + b-2;
	}
	
}
