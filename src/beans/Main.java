package beans;

public class Main {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nome = "Carlos";
		c1.numConta = 123;
		c1.limite = 5000d;
		c1.saldo = 2500d;
		// M�todos
		c1.deposito(1000);
		
		System.out.println("\tCONTAS \n");
		
		System.out.println(
				" Nome: " + c1.nome 
				+ "\n N�mero da Conta: " + c1.numConta 
				+ "\n Limite: " + c1.limite 
				+ "\n Seu saldo �: " + c1.saldo
				+ "\n Verifica��o: " + c1.saque(500));
		
		System.out.println("\n");
		
		Conta c2 = new Conta();
		c2.nome = "Siangue";
		c2.numConta = 321;
		c2.limite = 10000;
		c2.saldo = 7000;
		//M�todos
		c2.deposito(500);
		// M�todo que exibe as informa��es da Conta
		System.out.println(c2.toString());
		
	}
}
