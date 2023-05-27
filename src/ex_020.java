import java.util.Scanner;

public class ex_020 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int nota=0;
        boolean notaValida =false;

        do {
            System.out.printf("entre com uma nota \n");
            nota= scan.nextInt();

            if (nota>=0 && nota<=10){
                notaValida=true;
                System.out.printf("Você digitou %d",nota);
            } else{
                System.out.printf("nota invalida, digite novamente \n");
            }
        } while (notaValida==false); // ou !notaValida


    }
}
