package br.edu.ifpb;

public class Professor extends Informacoes {
    private String grauInst;
    private double salarioBase;

    public Professor() {
        super();
        this.setGrauInst("basico");
        this.setSalarioBase(980);

    }

    public Professor(int matricula, String nome, String grauInst, double salarioBase) {
        super(matricula, nome);
        this.setGrauInst(grauInst);
        this.setSalarioBase(salarioBase);

    }

    public String getGrauInst() {
        return grauInst;
    }

    public void setGrauInst(String grauInst) {
        this.grauInst = grauInst;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Grau Instituição: " + getGrauInst() + ", Salario: " + getSalarioBase();
    }
}
