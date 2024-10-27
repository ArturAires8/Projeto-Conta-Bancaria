
public class Main {

	public static void main(String[] args) {

		
		Cliente Artur = new Cliente();
		Artur.setNome("Artur");
		
		Conta cc = new ContaCorrente(Artur);
		Conta poupanca = new ContaPoupanca(Artur);

		
		cc.transferir(100, poupanca);
		cc.depositar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
