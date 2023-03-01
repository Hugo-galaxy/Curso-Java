import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args){
        double K,Re,Ra,F;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor em C° \n");
        double C = scan.nextDouble();

        F=C*1.8+32;
        K=C+273.15;
        Re=C*0.8;
        Ra=C*1.8+32+459.67;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin  é: " + K);
        System.out.println("A temperatura em Réaumur é: " + Re);
        System.out.println("A temperatura em Rankine é: " + Ra);
    }
}
