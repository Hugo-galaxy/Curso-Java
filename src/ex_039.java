import java.util.Random;

public class ex_039 {
    public static void main (String[] args){
        int matriz[][]=new int[10][10];
        int maiorL5=Integer.MIN_VALUE;
        int menorL5=Integer.MAX_VALUE;
        Random numeroRandom=new Random();

        for(int i=0;i<matriz.length;i++){     //cria a matriz com valores randomicos
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=numeroRandom.nextInt(100);
            }
        }
        //conferir maior e menor da linha 5
        for (int i=0;i<matriz.length;i++){
                if (matriz[5][i]>maiorL5){
                    maiorL5=matriz[5][i];
                }
                if (matriz[5][i]<menorL5){
                    menorL5=matriz[5][i];
                }
        }
        int maiorCol7=Integer.MIN_VALUE;
        int menorCol7=Integer.MAX_VALUE;
        //conferir manior e menor da coluna 7
        for (int i=0;i<matriz.length;i++){
            if(matriz[i][7]>maiorCol7){
                maiorCol7=matriz[i][7];
            }
            if (matriz[i][7]<menorCol7){
                menorCol7=matriz[i][7];
            }
        }

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                System.out.printf(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("maior linha5: "+maiorL5);
        System.out.println("menor linha5: "+menorL5);
        System.out.println("maior coluna7: "+maiorCol7);
        System.out.println("menor coluna7: "+menorCol7);
    }
}
