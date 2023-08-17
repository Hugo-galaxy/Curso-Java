package Exercicios;

import java.util.Scanner;

public class ex_021 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        boolean dadoValido=false;
        String senha,name;
        do {
            System.out.println("Digite o nome de usuario");
            name = scan.next();
            System.out.println("insira sua senha");
            senha = scan.next();
            if (name.equals(senha)) {
                dadoValido=false;
                System.out.println("dados iguais, digite novamente");

            } else {
                dadoValido=true;
                System.out.println("dados validos");
            }
        } while (!dadoValido); // ==false
    }
}
