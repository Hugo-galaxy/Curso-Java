import java.util.Scanner;

public class ex_030 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num,i;
        boolean primo=true;
        System.out.println("digite um numero inteiro");
        num = scan.nextInt();

        for (i=2;i<num;i++){
            if (num % i==0){
                System.out.println("nao é primo, divisivel por "+i);
                primo=false;
            }
        } if (primo){
            System.out.println("é numero primo");
        }
    }
}
