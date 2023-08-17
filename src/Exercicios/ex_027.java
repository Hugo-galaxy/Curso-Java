package Exercicios;

import java.util.Scanner;

public class ex_027 {
    public static void main (String [] args){
        int i,num;
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o numero fatorial");
        num = scan.nextInt();
        int fatorial=1;

        for (i=num;i>0;i--){
            fatorial=fatorial*i;
            System.out.printf("%d \n",i);
        }
        System.out.printf("\n fatorial é: %d ",fatorial);
    }
}
