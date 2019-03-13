package br.edu.ifpb;

import java.util.Scanner;


public class Lista01_04 {
    public static void main( String[] args ) {
        Scanner ler = new Scanner(System.in);

        double n1, n2, n3, n4 ,media;

        System.out.println("Digite a 1° nota: ");

        n1 = ler.nextDouble();

        System.out.println("Digite a 2° nota: ");

        n2 = ler.nextDouble();

        System.out.println("Digite a 3° nota: ");

        n3 = ler.nextDouble();

        System.out.println("Digite a 4° nota: ");

        n4 = ler.nextDouble();

        media = (n1 + n2 + n3 + n4 )/4;

        if(media>=7){
            System.out.println("Aprovado");
        }
        else if (media>= 5 && media < 7){
            System.out.println("Final");
        }
        else{
            System.out.println("Reprovado");
        }

    }
}
