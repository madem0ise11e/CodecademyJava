
public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static double calcolaDistanza(Punto punto1, Punto punto2) {
		double distanza = 0;

		distanza = Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));

		return distanza;

	}

	public  int getX() {
		return x;
	}

	public  void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
