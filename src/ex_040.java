import java.util.Scanner;

public class ex_040 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int matriz [][]=new int[3][3];

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.printf("digite o valor da posiçao ["+i+","+j+"]");
                matriz[i][j]=scan.nextInt();
            }
        }
        int qtdPares=0;
        int qtdImpares=0;
        for (int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if (matriz[i][j]%2==0){
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.printf(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("numeros pares: "+qtdPares);
        System.out.println("numeros impares: "+qtdImpares);
    }
}
