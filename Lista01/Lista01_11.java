package br.edu.ifpb;

import java.util.Scanner;


public class Lista01_11
{
    public static void main( String[] args )
    {
        Scanner ler = new Scanner(System.in);

        int quant, codigo,quantDoProduto;
        float valor =0,total =0,resultado =0;

        System.out.println("Digite a quantidade de produtos a ser pedido");
        quant = ler.nextInt();

        for (int i = 0; i <quant ; i++) {

            System.out.println("Digite o codigo: ");
            codigo = ler.nextInt();

            System.out.println("Digite a quantidade do produto: ");
            quantDoProduto = ler.nextInt();

            if(codigo == 10 ) {
                valor = quantDoProduto*1.50f;
                total += valor;
            }
            else if(codigo == 11 ) {
                valor = quantDoProduto*1.80f;
                total += valor;
            }
            else if(codigo == 12 ) {
                valor = quantDoProduto*1.90f;
                total += valor;
            }
            else if(codigo == 20 ) {
                valor = quantDoProduto*10.00f;
                total += valor;
            }
            else if(codigo == 30 ) {
                valor = quantDoProduto*8.00f;
                total += valor;
            }
            else if(codigo == 50 ) {
                valor = quantDoProduto*2.50f;
                total += valor;
            }

        }
        resultado = total;

        if(total >=50){
            resultado = (5/100)*total;
        }


        System.out.println("Valor da compra " + resultado);
    }
}
