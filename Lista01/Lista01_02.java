package br.edu.ifpb;

import java.util.Scanner;


public class Lista01_02
{
    public static void main( String[] args ) {

        Scanner ler = new Scanner(System.in);
        int  ano, calIdade;

        System.out.println("Digite seu ano de nascimento: ");

        ano = ler.nextInt();
        calIdade = 2019 - ano;

        System.out.println("Sua idade é: " + calIdade);


    }
}
