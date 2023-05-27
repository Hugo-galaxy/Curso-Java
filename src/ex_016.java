import java.util.Scanner;

public class ex_016 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 7");
        int diaSemana= scan.nextInt();

        switch (diaSemana){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sábado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("valor invalido");
        }
    }
}
