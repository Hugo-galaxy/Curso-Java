import java.util.Scanner;

public class ex_018 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o ano:");
        int ano = scan.nextInt();

        if ( (ano % 400==0) || (ano % 4==0 && ano % 100!=0)){
            System.out.println("o ano é bissexto");
        }else{
            System.out.println("o ano não é bissexto");
        }
    }
}
