package Exercicios;

import java.util.Scanner;

public class ex_015 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("digite o valor do salario de 280 a 1500");
        double salario= scan.nextDouble();
        double aumento;
        double salarioFinal;
        if (salario<=280){
            aumento=(salario*20)/100;
            salarioFinal=salario+aumento;
            System.out.printf("o salario anterior era de %.2f\n",salario);
            System.out.printf("a porcentagem do ajuste é de 20 porcento\n");
            System.out.printf("o valor do aumento é de %.2f\n",aumento);
            System.out.printf("o novo salario é de %.2f \n",salarioFinal);
        } else if (salario>=280 && salario<=700){
            aumento=(salario*15)/100;
            salarioFinal=salario+aumento;
            System.out.printf("o salario anterior era de %.2f\n",salario);
            System.out.printf("a porcentagem do ajuste é de 15 porcento\n");
            System.out.printf("o valor do aumento é de %.2f\n",aumento);
            System.out.printf("o novo salario é de %.2f \n",salarioFinal);
        } else if (salario>=700 && salario<=1500){
            aumento=(salario*10)/100;
            salarioFinal=salario+aumento;
            System.out.printf("o salario anterior era de %.2f\n",salario);
            System.out.printf("a porcentagem do ajuste é de 10 porcento\n");
            System.out.printf("o valor do aumento é de %.2f\n",aumento);
            System.out.printf("o novo salario é de %.2f\n",salarioFinal);
        }else {
            aumento=(salario*5)/100;
            salarioFinal=salario+aumento;
            System.out.printf("o salario anterior era de %.2f\n",salario);
            System.out.printf("a porcentagem do ajuste é de 5 porcento\n");
            System.out.printf("o valor do aumento é de %.2f\n",aumento);
            System.out.printf("o novo salario é de %.2f\n",salarioFinal);
        }
    }
}
