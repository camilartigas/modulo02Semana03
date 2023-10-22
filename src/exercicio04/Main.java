package exercicio04;

public class Main {
    public static void main(String[] args) {
        Contador2 contador = new Contador2("Diferença entre este exercício e o 03");
        int qtdPalavras = contador.contarPalavras();
        System.out.println(qtdPalavras);
    }
}
