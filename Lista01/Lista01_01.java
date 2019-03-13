package br.edu.ifpb;

import java.util.Scanner;


public class Lista01_01
{
    public static void main( String[] args ) {
        Scanner ler = new Scanner(System.in);
        float valor, converter;

        System.out.printf("Digite o valor para ser convertido de m/s para km/h: ");
        valor = ler.nextFloat();

        converter = valor*3.6f;

        System.out.printf("O valor convertido é: " + converter);


    }
}
