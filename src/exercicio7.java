import java.util.Scanner;
import static java.lang.Math.*;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("numero inteiro 1");
        int numeroInteiro = scan.nextInt();
        System.out.println("numero inteiro 2");
        int numeroInteiro2 = scan.nextInt();
        System.out.println("numero real");
        double numeroReal = scan.nextDouble();

        double produto = numeroInteiro*(numeroInteiro*2)/numeroInteiro2;
        double soma =(numeroInteiro*3)+numeroReal;
        double cubo = pow(numeroReal,3);

        System.out.printf("produto é %f, a soma é %f, o cubo é %f",produto,soma,cubo);
    }
}
