package HospedagemAnimais;

import java.util.*;

public class Teste01 {
	
	
	static Pessoa pess;
	static Tutor[] tutores = new Tutor[40];
	static Animal animal;
	
	static Servico serv01;
	static Petlover petL01;
	
	public static void main(String[] args) {
		
		GregorianCalendar d = new GregorianCalendar();
		Date dtAgora = d.getTime();
		
		
		// inserção dados tutor e animais
		tutores[0] = new Tutor("Emily", "Rua Jeriva 9");
		animal = new Animal("Mimi", "M", 5, "gato");
		tutores[0].inserirAnimal(animal);
		
		animal = new Animal("Audrey", "F", 6, "gato");
		tutores[0].inserirAnimal(animal);
		
		// inserção dados tutor e animais
		tutores[1] = new Tutor("Leonardo", "Rua 30 Sul");
		animal = new Animal("Lennon", "M", 6, "cachorro");
		tutores[1].inserirAnimal(animal);
		
		
		//inserção dados petlover (prestador de serviços)
		petL01 = new Petlover("Catlen", 00100132100, 28.00, 53.00, 31.00);
		
		
		//inserção serviço avulso
		serv01 = new Servico("Passeio Avulso", dtAgora, 10, 28.00);
		
		
		
		// saida de dados
		System.out.println("HOSPEDAGEM DE ANIMAIS");
		System.out.println("***************************");
				
		System.out.println(petL01.toString());
		System.out.println("***************************\n");
		

		System.out.println(tutores[0].toString());
		System.out.println(tutores[0].imprimirAnimaisTutor(tutores[0]));
		System.out.println("***************************");
		
		System.out.println(tutores[1].toString());
		System.out.println(tutores[1].imprimirAnimaisTutor(tutores[1]));
		System.out.println("***************************\n");
		
		System.out.println(serv01.toString());
		System.out.println("***************************\n");
		
	}

}
