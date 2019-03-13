package br.edu.ifpb;


import java.util.Scanner;

public class Lista01_06
{
    public static void main( String[] args ) {
        Scanner ler = new Scanner(System.in);
        String nome ;
        float diaria,multi;

        System.out.println("Digite seu nome: ");
        nome = ler.next();
        System.out.println("Digite a quantidade de diaria: ");
        diaria = ler.nextFloat();

        if(diaria>15) {
            multi = diaria*5.50f;
            System.out.println("Nome: "+ nome + " Valor: " + multi);
        }
        else if(diaria == 15){
            multi = diaria*6.00f;
            System.out.println("Nome: "+ nome + " Valor: " + multi);
        }
        else{
            multi = diaria*8.00f;
            System.out.println("Nome: "+ nome + " Valor: " + multi);
        }
    }
}
