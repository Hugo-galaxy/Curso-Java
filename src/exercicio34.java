import java.util.Scanner;

import static java.lang.Math.sqrt;

public class exercicio34 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int vetorA[] = new int[15];
        double vetorB[] = new double[vetorA.length];

        for (int i=0;i< vetorA.length;i++){
            System.out.println("entre com o vetor");
            vetorA[i]= scan.nextInt();

            vetorB[i]= sqrt(vetorA[i]);
        }

        System.out.println("vetor A");
        for (int i=0; i <vetorA.length;i++){
            System.out.printf(vetorA[i]+" ");
        }
        System.out.println();
        System.out.println("vetor B");
        for (int i=0; i<vetorB.length;i++){
            System.out.printf(vetorB[i]+" ");
        }
    }
}
