package HospedagemAnimais;
import java.util.Date;


public class Servico {
	private String tipo;
	private Date data;
	private int horaInicio;
	private int duracao;
	private double valor;

	public Servico(String tipo, Date data, int horaInicio, double valor) {
		this.tipo = tipo;
		this.data = data;
		this.horaInicio = horaInicio;
		this.valor = valor;
		
	}
	
	public String toString() {
		return "SERVIÇO: " +getTipo()+ " // data: " +getData()+ 
				" // hora inicio: " +getHoraInicio()+
				" // valor: " +valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
