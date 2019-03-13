package br.edu.ifpb;


public class Lista01_12
{
    public static void main( String[] args ) {
        double x,y;
        int convert1,convert2;

        System.out.println("Numero Quadrado Cubo");
        for (int i = 0; i <11 ; i++) {
            x = Math.pow(i,2);
            y = Math.pow(i,3);
            convert1 = (int)x;
            convert2 = (int)y;


            System.out.printf("  %d      %d       %d\n",i,convert1,convert2 );
        }
    }
}
