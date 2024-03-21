package prova;

public class Dipendente {
    private String nome;
    private Double salario;

    public Dipendente(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome + " - Salario: " + salario);
    }

//    public void aumentaSalario(Double aumento) {
//        salario += aumento;
//    }

    public void calcolaAumento() {
        Double aumento = 0.0;

    }
}
