import java.util.Random;

public class ex_041 {
    public static void main (String [] args){
        int [] notas = new int[10];
        Random random = new Random();

        for (int i=0; i< notas.length;i++){
            notas[i]= random.nextInt();
        }
        for (int i=0; i< notas.length;i++){
            System.out.println(notas[i]);
        }

        System.out.println();
        //usando for each, (setar valores usando tipos primitivos usa o for normal.
        for (int nota :notas){  //int nota = notas[i]
            System.out.println(nota);
        }
    }
}
