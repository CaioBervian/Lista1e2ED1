package Lista2;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vetor v = new Vetor();
		boolean menu = true;
		Scanner entrada  =  new Scanner(System.in);
		while(menu){
			System.out.println("\n1) Inserir"
					+ "\n2) Mostrar"
					+ "\n3) Mostrar inverso"
					+ "\n4) Exercicio 4"
					+ "\n5) exercicio 5"
					+ "\n6) Sair");
			int escolha =  entrada.nextInt();
			switch(escolha) {
				case(1):
					System.out.println("Inserir um numero:");
					System.out.println(v.inserir(entrada.nextInt()));
					
					break;
				case(2):
					v.mostrar();
					break;
				case(3):
					v.inverso();
					break;
				case(6):
					menu = false;
					break;
				case(4):
					DigitoConstrutor dt = new DigitoConstrutor();
				
					System.out.println("Digite um numero para receber o digito verificador :");
					String d = entrada.nextLine();
					System.out.println(dt.digito(d));
					break;
				case(5):
					VerificaCPF vcpf = new VerificaCPF();
					System.out.println("Digite o numero de cpf: ");
					System.out.println("Somente numeros");
					String cpf = entrada.nextLine();
					vcpf.setCpf(cpf);
					if(vcpf.verifica())
						System.out.println("Valido !");
					else
						System.out.println("Invalido ");
					break;
				default:
					System.out.println("Opção não existe");
			}
				
			
			
		}
		
		

	}

}
