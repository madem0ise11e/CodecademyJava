package customArray;

public class Main {

	public static void main(String[] args) {
		Array customArray = new Array("mioVettore FOR", 4);

		System.out.println("Nome: " + customArray.getNome());
		System.out.println("Dimensione: " + customArray.getDimensione());

		int[] array = customArray.getArray();
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;

		customArray.stampa();

		System.out.println(customArray.somma());
		
		customArray.aggiungiNumero(3,1);
		
		customArray.stampa();
		System.out.println(customArray.somma());
	}
}
