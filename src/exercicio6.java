import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("quanto voce ganha por hora trabalhada?");
        double horaTrabalho = scan.nextDouble();
        System.out.println("qual a quantidade horas trabalhadas no mes?");
        double horaMes = scan.nextDouble();

        double salario=horaTrabalho*horaMes;

        System.out.println("salario mensal é: "+salario);
    }
}
