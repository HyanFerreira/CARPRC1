package exercicio02;

public class Main {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Hyan", "TI", 3500, "10/04/2025", "RG27");

        f.recebeAumento(1000);

        System.out.println("O Funcionario " + f.getNome() + " recebe: R$ " + f.getSalario() + " por mês");
        System.out.println("E ganha R$ " + f.calculaGanhoAnual() + " por ano");
    }
}
