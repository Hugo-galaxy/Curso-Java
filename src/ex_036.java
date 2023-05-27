import java.util.Scanner;

public class ex_036 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int vetorA[]=new int[10];
        int vetorB[]=new int[10];
        int vetorC[]=new int[10];

        for (int i=0;i<vetorA.length;i++){
           System.out.println("entre com o vetor A");
           vetorA[i]=scan.nextInt();
        }
        for (int i=0;i<vetorB.length;i++){
            System.out.println("entre com o vetor B");
            vetorB[i]=scan.nextInt();

            vetorC[i]=vetorA[i]+vetorB[i];
        }
        System.out.println("vetor A");
        for (int i=0;i<vetorA.length;i++){
            System.out.printf(vetorA[i]+" ");
        }
        System.out.println("vetor B");
        for (int i=0;i<vetorB.length;i++){
            System.out.printf(vetorB[i]+" ");
        }
        System.out.println("vetor C");
        for (int i=0;i<vetorC.length;i++){
            System.out.printf(vetorC[i]+" ");
        }
    }
}
