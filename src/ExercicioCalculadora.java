import java.util.Scanner;

public class ExercicioCalculadora {
    public static void imprimirValor(double num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        int fatorial;
        Scanner scan = new Scanner(System.in);
        double num1,num2;
        System.out.println("digite o valor 1");
        num1= scan.nextDouble();
        System.out.println("digite o valor 2");
        num2=scan.nextDouble();
        do {
            System.out.println("digite o valor do fatorial");
            fatorial=scan.nextByte();
            if (fatorial<0){
                System.out.println("numero invalido, digite novamente");
            }
        }while (fatorial<0);

        Calculadora.fatorial(fatorial);


        imprimirValor(Calculadora.soma(num1,num2));
        imprimirValor(Calculadora.dividir(num1,num2));
        imprimirValor(Calculadora.subtrair(num1,num2));
        imprimirValor(Calculadora.potencia(num1,num2));
    }
}
