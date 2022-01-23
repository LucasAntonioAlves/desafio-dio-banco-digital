package digital.banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");
        lucas.setIdade(22);
        lucas.setCpf("068.111.111-00");
        lucas.setNomeBanco("ITAU");

        Cliente alves = new Cliente();
        alves.setNome("Alves");
        alves.setIdade(26);
        alves.setCpf("055.111.111-11");
        alves.setNomeBanco("NuBank");

        Conta cc = new ContaCorrente(lucas);
        Conta cp = new ContaPoupanca(alves);

        cc.depositar(500);
        cc.transferir(200, cp);
        cc.sacar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
