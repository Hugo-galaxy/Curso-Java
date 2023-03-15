import java.util.Scanner;

public class exercicio25 {
    public static void main (String [] args){
        int i,num,maior=Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        for (i=0;i<5;i++){
            System.out.printf("entre com o numero inteiro \n");
            num= scan.nextInt();
                if (num>maior){  //se o valor do input for maior que o minimo valor declarado na variavel "maior"
                    maior=num;   //variavel "maior" vai receber o maior valor digitado pelo usuario (variavel num)
                    System.out.printf("o numero maior mudou %d\n",maior);
                }
        }
        System.out.printf("o maior numero digitado foi %d",maior);
    }
}
