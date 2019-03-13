package br.edu.ifpb;

import java.util.Scanner;


public class Lista01_08
{
    public static void main( String[] args ) {
        Scanner ler = new Scanner(System.in);
        int num,max = 0,min = 1000;
        float media =0;
        int vetor[] = new int[10];

        for (int i = 0; i<10; i++){
            System.out.println("Digite o numero: ");
            num = ler.nextInt();
            vetor[i] = num;
        }
        for (int i = 0; i<10; i++){
            media += vetor[i];

            if(vetor[i]> max){
                max = vetor[i];
            }
            if(vetor[i]<min){
                min = vetor[i];
            }
        }

        System.out.println("Media " + media/10 + " Maior " + max + " Minimo " + min);

    }
}
