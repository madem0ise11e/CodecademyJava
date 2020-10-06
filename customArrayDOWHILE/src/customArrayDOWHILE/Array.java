package customArrayDOWHILE;

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
		int i = 0;
		while (i < this.array.length) {
			System.out.println(this.array[i]);
			i++;
		}

	}

	public int somma() {
		int somma = 0;
		int i = 0;
		while (i < this.array.length) {
			somma = somma + this.array[i];
			i++;
		}
		return somma;
	}

	public int[] getArray() {
		return this.array;
	}

}
