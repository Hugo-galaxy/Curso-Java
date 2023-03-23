import java.util.Scanner;

public class exercicio35 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[vetorA.length];

        for (int i=0;i<vetorA.length;i++){
            System.out.println("entre com o vetor");
            vetorA[i] = scan.nextInt();

            vetorB[i]= vetorA[i]*i;
        }
        System.out.println("vetor A");
        for (int i=0;i<vetorA.length;i++){
            System.out.printf(vetorA[i]+" ");
        }
        System.out.println();
        System.out.printf("vetor B");
        for (int i=0;i< vetorB.length;i++){
            System.out.printf(vetorB[i]+" ");
        }
    }
}
