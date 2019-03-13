package br.edu.ifpb;


import java.sql.SQLOutput;
import java.util.Scanner;


public class Lista01_05
{
    public static void main( String[] args ) {

        Scanner ler = new Scanner(System.in);
        int numero;

        System.out.println("Digite: ");
        numero = ler.nextInt();
        ImprimirMes teste = new ImprimirMes();

        teste.Imprimir(numero);


    }
}
