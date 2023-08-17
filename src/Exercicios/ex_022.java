package Exercicios;

import java.util.Scanner;

public class ex_022 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        String name,sexo,estadoCivil;
        int idade;
        double salario;
        boolean dadoValido=false; //flag
        do {
            System.out.println("insira o nome");
            name= scan.next();
                if (name.length()>3){
                    dadoValido=true;
                }else{
                    System.out.println("nome com menos de 3 caracteres,digite novamente");
                }
        } while (dadoValido==false); //!dadoValido

        dadoValido=false;
        do {
            System.out.println("digite a idade");
            idade= scan.nextByte();
                if (idade>=0 && idade<=150){
                    dadoValido=true;
                }else{
                    System.out.println("idade não esta entre 0 e 150, digite novamente");
                }
        }while (!dadoValido);

        dadoValido=false;
        do {
            System.out.println("digite o salario");
            salario= scan.nextByte();
                if (salario>0){
                    dadoValido=true;
                }else{
                    System.out.println("salario menor que zero, digite o valor novamente");
                }
        }while (dadoValido==false);

        dadoValido=false;
        do {
            System.out.println("digite o sexo f ou m");
            sexo= scan.next();
                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                    dadoValido=true;
                }else{
                    System.out.println("valor inserido incorreto");
                }
        }while (dadoValido==false);

        dadoValido=false;
        do {
            System.out.println("digite o estado civil s,c,v,d");
            estadoCivil= scan.next();
                if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
                estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                    dadoValido=true;
                }else{
                    System.out.println("valor inderido incorreto");
                }
        }while(!dadoValido);
    }
}
