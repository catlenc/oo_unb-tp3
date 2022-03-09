package HospedagemAnimais;

public class Animal {
	private int qtdAnimal;
	private String nome;
	private String sexo;
	private int idade;
	private String obs;

	public Animal(String nome, String sexo, int idade, String obs) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.obs = obs;		
	}

	public int getQtdAnimal() {
		return qtdAnimal;
	}

	public void setQtdAnimal(int qtdAnimal) {
		this.qtdAnimal = qtdAnimal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
