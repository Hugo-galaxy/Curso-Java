import java.util.Scanner;

public class ex_008 {
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        double numero1= scan.nextDouble();
        System.out.println("digite o segundo numero:");
        double numero2= scan.nextDouble();

        if (numero1>numero2){
            System.out.printf("%f é maior",numero1);
        }else {
            System.out.printf("%.2f é maior",numero2);
        }
    }
}
