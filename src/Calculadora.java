public class Calculadora {

    public static double soma(double num1,double num2){
        System.out.printf("soma: ");
        return num1+num2;
    }


    public static double subtrair(double num1,double num2){
        System.out.printf("subtração: ");
        return num1-num2;
    }

    public static double dividir(double num1,double num2){
        System.out.printf("divisão: ");
        return num1/num2;
    }

    public static int fatorial (int num){
        if (num ==0){
            return 1;
        }

        int total =1;
        for (int i=num; i>1;i--){
            total=total*i;

        }
        System.out.println("fatorial não recursivo: "+total);
        return 0;
    }

    public static double multiplicar(double num1,double num2){
        System.out.printf("multiplicação: ");
        return num1*num2;
    }
    public static double potencia(double num1,double num2){
        System.out.printf("potenciação: ");
        return Math.pow(num1,num2);
    }

    public static int fatorialRecursivo (int num){
        if (num==0){
            return 1;
        }
        return num*fatorialRecursivo(num-1);
    }






}
