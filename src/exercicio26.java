import java.util.Scanner;

public class exercicio26 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int i,num,media;
        int soma=0;
        for (i=0;i<5;i++){
            System.out.printf("entre com o numero");
            num=scan.nextInt();
            soma=soma+num; //soma que está atribuida como zero será somada com o valor digitado pelo usuario
            System.out.printf("a soma agora é %d \n",soma);
        }
        media=soma/5;
        System.out.printf("a soma dos numeros é %d e a media é %d",soma,media);
    }
}
