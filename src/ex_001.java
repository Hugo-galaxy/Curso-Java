import java.util.Scanner;

public class ex_001 {
    public static void main (String[] args){
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        double numeroDigitado = scan.nextDouble();
        System.out.println("O numero digitado foi:"+numeroDigitado);
    }
}
