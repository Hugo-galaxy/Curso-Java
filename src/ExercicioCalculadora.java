import java.util.Scanner;

public class ExercicioCalculadora {
    public static void imprimirValor(double num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial,fibonacci,somatorio;
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

        System.out.println("digite o termo da sequencia de fibonacci que você deseja");
        fibonacci=scan.nextInt();

       System.out.println("digite um numero para calcular o somatorio dele");
       somatorio=scan.nextInt();

        imprimirValor(Calculadora.soma(num1,num2));
        imprimirValor(Calculadora.dividir(num1,num2));
        imprimirValor(Calculadora.subtrair(num1,num2));
        imprimirValor(Calculadora.potencia(num1,num2));

        System.out.println("Somatorio: "+Calculadora.somatorio(somatorio));

        Calculadora.fatorial(fatorial); //fatorial não recursivo
        System.out.println("Fatorial Recursivo:"+Calculadora.fatorialRecursivo(fatorial));//fatorial recursivo

        System.out.println("Fibonacci");
        for (int i=1;i<fibonacci;i++){
            System.out.print(Calculadora.fibonacci(i)+ " ");
        }


    }
}
