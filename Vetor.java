package Lista2;
import java.util.Arrays;

public class Vetor {


		public int limite = 10;
		public int vetor[] = new int [limite];
		public int pos = 0;
		
		public String inserir(int num) {
			if(pos<limite) {
				vetor[pos] = num;
				pos ++;
				return "Inserido com sucesso";
			}else {
				return "vetor cheio";
			}
			
		}
		
		public void mostrar() {
			for (int i = 0; i < pos; i++) {
				System.out.print(vetor[i]+"| ");
			}
			
		}

		public void inverso() {
			for (int i = pos-1; i >=0; i--) {
				System.out.println(vetor[i]+"| ");
			}
		
		}

		

		

}
