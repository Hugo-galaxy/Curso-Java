import java.util.Scanner;

public class ex_010 {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("digite F ou M");
        String valorDigitado= scan.next();

        switch (valorDigitado){
            case "F":
                System.out.println("F-feminino");
                break;
            case "M":
                System.out.println("M-masculino");
                break;
            default:
                System.out.println("valor invalido");
        }
    }
}
