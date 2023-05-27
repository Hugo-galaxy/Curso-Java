import java.util.Scanner;

public class ex_019 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        int num= scan.nextInt();

        if (num %2==0){
            System.out.println("o numero é par");
        }else {
            System.out.println("o numero é impar");
        }
    }
}
