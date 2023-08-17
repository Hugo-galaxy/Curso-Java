package Exercicios;

import java.util.Scanner;

public class ex_014 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("digite o valor do primeiro produto");
        double produto1= scan.nextDouble();
        System.out.printf("digite o valor do segundo produto");
        double produto2= scan.nextDouble();
        System.out.printf("digite o valor do terceiro produto");
        double produto3= scan.nextDouble();

        if(produto1<produto2 && produto1<produto3){
            System.out.printf("produto 1 esta mais barato no valor de %.2f",produto1);
        } else if (produto2<produto1 && produto2<produto3){
            System.out.printf("produto 2 esta mais barato no valor de %.2f",produto2);
        }else{
            System.out.printf("produto 3 esta mais barato no valor de %.2f",produto3);
        }
    }
}
