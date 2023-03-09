import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("insira um valor:");
        double valor= scan.nextDouble();

        if (valor>=0){
            System.out.printf("o valor é positivo");
        }else {
            System.out.printf("o valor é negativo");
        }
    }
}
