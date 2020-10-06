
public class Main {

	public static void main(String[] args) {
		
		
		Punto punto1= new Punto(2, 3);
		Punto punto2= new Punto(4, 5);
		
		double distanza;
		distanza = Punto.calcolaDistanza(punto1, punto2);
		System.out.println(distanza);
		System.out.println(Math.round(distanza));
		
		//System.out.println(Punto.calcolaDistanza(punto1, punto2));

	}

}
