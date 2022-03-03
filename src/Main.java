public class Main {

    public static void main(String[] args) {
        Cliente julia = new Cliente();
        julia.setNome("Júlia");

        IConta cc = new ContaCorrente(julia);
        IConta cp = new ContaPoupanca(julia);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}