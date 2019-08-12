package Lista1;
import java.util.Scanner;
class Pessoa {

	public String nome;
	public String email;
	public String telefone;
}
public class Contato {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
	Pessoa[] pes = new Pessoa[10];
	
	for (int i=0; i<=100;i++) {
	System.out.println("1 - Cadastrar Contatos");
	System.out.println("2 - Listar contatos");
	System.out.println("3 - Sair");
	int valor = entrada.nextInt();
	
	if (valor == 1) {
		for (int j=0; j<=1;j++) {
			System.out.println("Nome");
		
			String lnome = entrada.nextLine();
			entrada.nextLine();
			
			System.out.println("Telefone");
			String ltelefone = entrada.nextLine();
			
			System.out.println("Email");
			String lemail = entrada.nextLine();
			
			pes[j] = new Pessoa();
			pes[j].nome = lnome;
			pes[j].telefone = ltelefone;			
			pes[j].email = lemail;
	}
	}
	
	if (valor == 2) {
		for (int j=0;j<=1;j++) {
			System.out.println("Nome: " + pes[j].nome);
			System.out.println("Telefone: " + pes[j].telefone);
			System.out.println("email: " + pes[j].email);
		}
	}
	
	if (valor == 3) {
		break;
	}
	
	if ((valor <3) || (valor<1) ) {
		System.out.println("1 - Cadastrar Contatos");
		System.out.println("2 - Listar contatos");
		System.out.println("3 - Sair");
	}
	}
	entrada.close();
	}}


