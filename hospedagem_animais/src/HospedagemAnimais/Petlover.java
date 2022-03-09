package HospedagemAnimais;

public class Petlover extends Pessoa {
	private double valorHoraPasseio;
	private double valorHoraPetsitter;
	private double valorHoraHotel;

	public Petlover(String nome, Integer cpf, Double horaPasseio, Double horaPetsister, Double horaHotel) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.valorHoraPasseio = horaPasseio;
		this.valorHoraPetsitter = horaPetsister;
		this.valorHoraHotel = horaHotel;
		
	}
	
	public String toString() {
		return "PETLOVER: " +getNome()+ " // CPF: " +getCpf()+ 
				" // hora passeio: " +valorHoraPasseio+
				" // hora pet siter: " +valorHoraPetsitter+
				" // hora hotel: " +valorHoraHotel;
				
	}

	public double getValorHoraPasseio() {
		return valorHoraPasseio;
	}

	public void setValorHoraPasseio(double valorHoraPasseio) {
		this.valorHoraPasseio = valorHoraPasseio;
	}

	public double getValorHoraPetsitter() {
		return valorHoraPetsitter;
	}

	public void setValorHoraPetsitter(double valorHoraPetsitter) {
		this.valorHoraPetsitter = valorHoraPetsitter;
	}

	public double getValorHoraHotel() {
		return valorHoraHotel;
	}

	public void setValorHoraHotel(double valorHoraHotel) {
		this.valorHoraHotel = valorHoraHotel;
	}

}
