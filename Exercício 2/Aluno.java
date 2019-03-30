package br.edu.ifpb;

public class Aluno extends Informacoes {

    private String dataNastimento;
    private String nomeMae;

    public Aluno() {
        super();
        this.setDataNastimento("00/00/0000");
        this.setNomeMae("---sem nome---");

    }

    public Aluno(int matricula, String nome, String dataNastimento, String nomeMae) {
        super(matricula, nome);
        this.setDataNastimento(dataNastimento);
        this.setNomeMae(nomeMae);

    }

    public String getDataNastimento() {
        return dataNastimento;
    }

    public void setDataNastimento(String dataNastimento) {
        this.dataNastimento = dataNastimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de nascimento: " + getDataNastimento() + ", Nome da mãe: " + getNomeMae() ;
    }
}
