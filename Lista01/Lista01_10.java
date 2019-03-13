package br.edu.ifpb;


import java.util.Scanner;

public class Lista01_10
{
    public static void main( String[] args )
    {
        Scanner ler = new Scanner(System.in);
        int num,cont =1 ;
        float x;

        System.out.println("Digite: ");
        num = ler.nextInt();
        x = num/2;
        while (x  > 1){
            cont++;
            x = x/2;
        }

        System.out.println("Ultima Divisao: " + x + " Quantidade de vezes Dividido: " + cont);

    }
}
