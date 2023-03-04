import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args){
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        double numeroDigitado = scan.nextDouble();
        System.out.println("O numero digitado foi:"+numeroDigitado);
    }
}
