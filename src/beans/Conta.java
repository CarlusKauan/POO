package beans;

public class Conta {
	int numConta;
	String nome;
	double saldo;
	double limite;
	
	// Sobrescrevendo método que exibe as informações das contas
	@Override
	public String toString() {
		return " Nome: " +  nome 
				+ "\n Número da Conta: " + numConta 
				+ "\n saldo: " + saldo 
				+ "\n limite: " + limite 
				+ "\n Verificação: " + saque(500);
	}
	// Método que faz o saque do saldo !
	boolean saque(double valor) {
		if(valor > saldo) {
			System.out.println("Limite indisponivel !");
			return true;
		}
		else {
			this.saldo -= valor;
			System.out.println("Você tem limite para o saque !");
			return true;
		}
	}
	// Método que faz o deposito para o saldo !
	double deposito(double valor) {
		return this.saldo += valor;
	}
}
