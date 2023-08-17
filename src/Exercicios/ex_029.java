package Exercicios;

import java.util.Scanner;

public class ex_029 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int valor,i,total=1;
        System.out.println("insira o valor da tabuada desejada");
        valor = scan.nextInt();
        for (i=1;i<=10;i++){
            total=valor*i;
            System.out.printf("%d x %d = %d \n",valor,i,total);
        }
    }
}
