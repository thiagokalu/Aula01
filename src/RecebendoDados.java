import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String nome; 
		System.out.println("Este Programa l� dados");
		System.out.println("por favor, digite seu nome");
		leitor.next();
		nome = leitor.next();
		System.out.println("Que legal ter voc� aqui," + nome);
		leitor.close();
	}
		
}
