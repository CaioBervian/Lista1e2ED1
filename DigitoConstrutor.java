package Lista2;

public class DigitoConstrutor {
	
	public int digito(String numero) {
		
		int num, multiplicador =2, soma = 0, digitoverificador;
		int limite = numero.length();
		int vetor [] = new int [limite];
		int calculo [] = new int[limite];
		for (int i = 0; i < limite; i++) {
			
			vetor[i]=Integer.parseInt(String.valueOf(numero.charAt(i)));
		
			
		}

		
		for (int i = limite-1; i >= 0; i--) {
			calculo[i] = vetor[i] * multiplicador;
			multiplicador ++;
			
		}
		for (int i = 0; i < calculo.length; i++) {
			soma = calculo[i]+ soma;
		}
		
		int resto = soma % 11;
		int subtrai = 11 - resto;

		if(subtrai == 11 || subtrai  == 10) {
			digitoverificador = 0;
		}else {
			digitoverificador = subtrai;
		}
		System.out.println(numero+digitoverificador);
		return digitoverificador;
	}
	

}
