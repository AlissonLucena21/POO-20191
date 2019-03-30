package br.edu.ifpb;

public class Turmas extends Informacoes{

    private int sala;
    private  String hora;
    private String tipo;

    public Turmas() {
        super();
        this.setHora("7:40");
        this.setSala(0);
        this.setTipo("A");
    }

    public Turmas(int matricula, String nome, int sala, String hora, String tipo) {
        super(matricula, nome);
        this.setHora(hora);
        this.setSala(sala);
        this.setTipo(tipo);
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sala: " + getSala() + ", Hora: " + getHora() + ", tipo: " + getTipo();
    }
}
