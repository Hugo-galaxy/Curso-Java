import java.util.Scanner;

public class ex_012 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double media;
        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota");
        double nota2= scan.nextDouble();

        media=(nota1+nota2)/2;

        if (media==10){
            System.out.println("Aprovado com distinção");
        } else if (media>=7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
