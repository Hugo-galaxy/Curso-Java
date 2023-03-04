import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor em metros");
        double valorMetros= scan.nextDouble();

        double conversao = valorMetros*100;

        System.out.println("o valor em centimetros é:"+conversao);

    }
}
