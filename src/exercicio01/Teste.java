package exercicio01;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setCpf(10345678901L);
        funcionario1.setNomeCompleto("Poliana Poli");
        funcionario1.setSalario(10_000F);

        Funcionario funcionario2 = new Funcionario(22365478900L, "Adão Antonio", 2_000F);

        funcionario1.promover(30F);
        System.out.println("O salário deste funcionário é: " + funcionario1.getSalario());

        funcionario2.promover(20F);
        System.out.println(String.format("O Salário deste funcionário é: %.2f", + funcionario2.getSalario()));
    }
}

