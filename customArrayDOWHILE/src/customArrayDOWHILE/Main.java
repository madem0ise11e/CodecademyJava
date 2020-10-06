package customArrayDOWHILE;

public class Main {

	public static void main(String[] args) {
		Array nomeArray = new Array("mioVettore FOR", 4);

		System.out.println("Nome: " + nomeArray.getNome());
		System.out.println("Dimensione: " + nomeArray.getDimensione());

		int[] array = nomeArray.getArray();
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;

		nomeArray.stampa();

		System.out.println(nomeArray.somma());
	}

}
