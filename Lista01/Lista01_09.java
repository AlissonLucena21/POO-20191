package br.edu.ifpb;


import java.util.Scanner;

public class Lista01_09
{
    public static void main( String[] args )
    {
        Scanner ler = new Scanner(System.in);
        int n1,n2,par=0,impar=0,soma =0;

        n1 = ler.nextInt();
        n2 = ler.nextInt();

        for (int i = n1; i <= n2 ; i++){
            if(i % 2 == 0){
                par += 1;
            }
            else{
                impar +=1;
            }

        }
        soma =impar +par;

        System.out.println( "Quantidade de pares: " + par +" Quantidade de impares: " + impar + " Soma: "+ soma );

    }
}
