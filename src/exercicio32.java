import java.util.Scanner;

public class exercicio32 {
    public static void main (String[] args){
        int [] vetorA = new int[8];
        int [] vetorB = new int [vetorA.length];
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<vetorA.length;i++){
            System.out.println("entre com o vetor");
            vetorA[i]= scan.nextInt();

            vetorB[i]=vetorA[i]*2;
        }
        System.out.println("vetor A");
        for (int i=0;i<vetorA.length;i++){
            System.out.printf(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("vetor B");
        for (int i=0;i<vetorB.length;i++){
            System.out.printf(vetorB[i]+" ");
        }
    }
}
