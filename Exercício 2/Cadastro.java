package br.edu.ifpb;


public class Cadastro
{
    public static void main( String[] args ) {

        Professor pro = new Professor();

        Professor pro2 = new Professor(120,"Alison","Superior",1000);

        Aluno alu = new Aluno();
        Aluno alu2 = new Aluno(2016,"Jose","12/03/1998","maria");

        Turmas tur = new Turmas();
        Turmas tur2 = new Turmas(12,"Infantil",10,"10:40","A");


        System.out.println(pro.toString());
        System.out.println(pro2.toString());
        System.out.println(alu.toString());
        System.out.println(alu2.toString());
        System.out.println(tur.toString());
        System.out.println(tur2.toString());

    }
}
