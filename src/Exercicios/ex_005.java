package Exercicios;

import java.util.Scanner;

public class ex_005 {
    public static void main (String[] args){
        Scanner scan =new Scanner(System.in);
        int lado,area,dobro;
        System.out.println("digite o lado do quadrado");
        lado = scan.nextInt();

        area=lado*lado;
        dobro=area*2;

        System.out.println("o dobro da area é:"+dobro);
    }
}
