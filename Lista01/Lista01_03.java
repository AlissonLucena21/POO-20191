package br.edu.ifpb;

import java.util.Scanner;


public class Lista01_03
{
    public static void main( String[] args ) {

        Scanner ler = new Scanner(System.in);

        double n1, n2, n3,media;

        System.out.println("Digite a 1° nota: ");

        n1 = ler.nextDouble();

        System.out.println("Digite a 2° nota: ");

        n2 = ler.nextDouble();

        System.out.println("Digite a 3° nota: ");

        n3 = ler.nextDouble();

        media = (n1*2 + n2*3 + n3*5 )/10;

        System.out.println("A media ponderada é: " + media);


    }
}
