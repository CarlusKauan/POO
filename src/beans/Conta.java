package beans;

public class Conta {
	int numConta;
	String nome;
	double saldo;
	double limite;
	
	// Sobrescrevendo m�todo que exibe as informa��es das contas
	@Override
	public String toString() {
		return " Nome: " +  nome 
				+ "\n N�mero da Conta: " + numConta 
				+ "\n saldo: " + saldo 
				+ "\n limite: " + limite 
				+ "\n Verifica��o: " + saque(500);
	}
	// M�todo que faz o saque do saldo !
	boolean saque(double valor) {
		if(valor > saldo) {
			System.out.println("Limite indisponivel !");
			return true;
		}
		else {
			this.saldo -= valor;
			System.out.println("Voc� tem limite para o saque !");
			return true;
		}
	}
	// M�todo que faz o deposito para o saldo !
	double deposito(double valor) {
		return this.saldo += valor;
	}
}
