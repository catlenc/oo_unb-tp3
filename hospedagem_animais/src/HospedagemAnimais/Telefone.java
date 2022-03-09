package HospedagemAnimais;

public class Telefone {
	private int ddd;
	private int num;
	
	public Telefone(int codDDD, int numero) {
		ddd = codDDD;
		num = numero;
	}
	
	public Telefone() {
		
	}
	
	@Override
	public String toString() {
		return "Telefone: (" + ddd + ") " + num;
	}
	
	public int getDDD() {
		return ddd;
	}
	
	public void setDDD(int codDDD) {
		ddd = codDDD;
	}
	
	public int getNumero() {
		return num;
	}
	
	public void setNumero(int numero) {
		this.num = numero;
	}
	
}
