import java.util.Random;

public class exercicio38 {
    public static void main (String[] args){
        int maior= Integer.MIN_VALUE;
        int linha=0;
        int col=0;
        int matrizM[][]=new int[4][4];
        Random numeroRandom = new Random();

        for (int i=0;i<matrizM.length;i++){
            for (int j=0;j<matrizM[i].length;j++){
             matrizM[i][j]=numeroRandom.nextInt(100);//constroi a matriz com numeros aleatorios
            }
        }

        for (int i=0;i<matrizM.length;i++){
            for (int j=0;j<matrizM[i].length;j++){
                if (matrizM[i][j]>maior){
                    maior=matrizM[i][j];
                    linha=i;
                    col=j;
                }
            }
        }
        for (int i=0;i<matrizM.length;i++){
            for (int j=0;j<matrizM[i].length;j++){
                System.out.printf(matrizM[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("maior valor: "+maior);
        System.out.println("linha: "+linha);
        System.out.println("coluna: "+col);
    }
}
