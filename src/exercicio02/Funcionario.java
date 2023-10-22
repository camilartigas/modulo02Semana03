package exercicio02;

public class Funcionario {
    private String nome;
    private Float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //sobrecargas ou overload de construtores (métoddos e contrutores podem ter sobrecarga) da linha 7 até 14

    public void aumentar(Float valor){
        this.salario += valor;
    }

    public void aumentar(Float valor, Float comissao){
        this.salario = this.salario + valor + comissao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}