import java.util.Scanner;

public class exercicio31 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int i;
        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length];

        for (i=0;i<vetorA.length;i++){
            System.out.println("entre com o valor da posição "+i);
            vetorA[i]= scan.nextInt();

            vetorB[i]=vetorA[i];
        }

        for (i=0;i< vetorA.length;i++){
            System.out.printf(vetorA[i] +" ");
        }
        System.out.println();
        System.out.printf("vetor B");
        for (i=0; i< vetorB.length;i++){
            System.out.printf(vetorB[i]+" ");
        }
    }
}
