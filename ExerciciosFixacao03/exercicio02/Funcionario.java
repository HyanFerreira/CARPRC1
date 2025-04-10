package exercicio02;

public class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private String dataEntrada;
    private String rg;

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }

    public double recebeAumento(double aumento) {
        return this.salario = this.salario + aumento;
    }

    public double calculaGanhoAnual() {
        return this.salario * 12;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getRg() {
        return rg;
    }
}
