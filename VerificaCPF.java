package Lista2;

public class VerificaCPF {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		
		}else {
			System.out.println("Pode conter somente 11 digitos");
		}
	}
	
	public boolean verifica() {
		int valido = 0;
		for (int i = 0; i < cpf.length(); i++) {
			if(!(Character.isDigit(cpf.charAt(i)))) {
				return false;
			}
		}
		
		return true;
	}
	
}
