package Exercicios;

import java.util.Scanner;
import static java.lang.Math.*;
public class ex_004 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o valor do raio");
        double raio = scan.nextDouble();
        double area= PI*pow(raio,2);

        System.out.println("a area é:"+area);
    }
}
