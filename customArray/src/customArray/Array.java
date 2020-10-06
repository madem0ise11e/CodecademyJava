package customArray;

public class Array {
	private String nome;
	private int dimensione;
	private int[] array;

	public Array(String nome, int dimensione) {
		this.nome = nome;
		this.dimensione = dimensione;
		this.array = new int[dimensione];
	}

	public Array() {

	}

	public String getNome() {
		return this.nome;
	}

	public int getDimensione() {
		return this.dimensione;
	}

	public void stampa() {

		for (int i = 0; i < this.array.length; i++) {
			System.out.println(this.array[i]);
		}

	}

	public int somma() {
		int somma = 0;

		for (int i = 0; i < this.array.length; i++) {
			somma = somma + this.array[i];
		}
		return somma;
	}

	public int[] getArray() {
		return this.array;
	}

	public void aggiungiNumero(int getArray, int indice) {
		/*if(this.array.length) {
			
		}else {
			System.out.println("");
		}*/
		
	}

}
