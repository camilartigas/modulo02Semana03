package exercicio02;

public class Teste {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Camila");

        funcionario.setSalario(2000F);
        funcionario.aumentar(300F);

        System.out.println(funcionario.getSalario());

    }
}
