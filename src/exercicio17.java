import java.util.Scanner;

public class exercicio17 {
    public static void main (String [] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("digite o valor do primeiro lado do triangulo");
        double lado1= scan.nextDouble();
        System.out.println("digite o valor do segundo lado do triangulo");
        double lado2= scan.nextDouble();
        System.out.println("digite o valor do terceiro lado do triangulo");
        double lado3= scan.nextDouble();


        if (lado1+lado2>lado3 || lado2+lado3>lado1 || lado1+lado3>lado2){
            if (lado1==lado2 && lado2==lado3 && lado1==lado3){
                System.out.println("é um triangulo equilatero");
            } else if (lado1==lado2 || lado2==lado3 || lado1==lado3){
                System.out.println("é um triangulo isósceles");
            }else if (lado1!=lado2 && lado2!=lado3 && lado1!=lado3) {
                System.out.println("é um triangulo escaleno");
            }
        }
        else {
            System.out.println("não é um triangulo");
        }
    }
}
