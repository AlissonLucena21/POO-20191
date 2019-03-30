package br.edu.ifpb;

public class Informacoes extends Object {

    private String nome;
    private int Matricula;

    public Informacoes() {
        this(00,"---sem nome---");
    }

    public Informacoes( int matricula,String nome) {
        setMatricula(matricula);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        this.Matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matricula: " + Matricula;
    }
}
