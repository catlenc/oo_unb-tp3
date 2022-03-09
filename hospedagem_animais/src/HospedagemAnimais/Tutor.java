package HospedagemAnimais;
import java.util.Date;


public class Tutor extends Pessoa {
	private Date datanasc;
	private String endereco;
	private Animal[] animaisTutor = new Animal[10];
	private int qtAnimais = 0;

	public Tutor(String nome, String endereco) {
		
		this.setNome(nome);
		this.endereco = endereco;
		//datanasc = ddatanasc;
	}
	
	public String toString() {
		return "TUTOR: " +getNome()+ " // endereço: " +endereco ;
	}
	
	public String imprimirAnimaisTutor(Tutor t) {
		
		String saida = "***** lista animais do tutor ***** \n" ;
		
		for (int i = 0; i < qtAnimais; i++) {
			// System.out.println(i);
			saida = saida + i + " - nome: "+ animaisTutor[i].getNome().toString();
			saida = saida + " // obs: "+ animaisTutor[i].getObs().toString();
			saida = saida + " // sexo: "+ animaisTutor[i].getSexo().toString();
			saida = saida + " // idade: "+ animaisTutor[i].getIdade();
			saida = saida + "\n";
		}
		
		return saida;
	}
	
	public void inserirAnimal(Animal aanimal) {
		animaisTutor[qtAnimais] = aanimal;
		qtAnimais++;		
	}
	

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getEnd() {
		return endereco;
	}

	public void setEnd(String endereco) {
		this.endereco = endereco;
	}

}
