import java.util.Scanner;

public class ex_011 {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("digite uma letra");
        String letraDigitada = scan.next();

        if (letraDigitada.equalsIgnoreCase("a") || letraDigitada.equalsIgnoreCase("e") ||
                letraDigitada.equalsIgnoreCase("i") || letraDigitada.equalsIgnoreCase("o") || 
                letraDigitada.equalsIgnoreCase("u")){
            System.out.println("vogal");
        }else{
            System.out.println("consoante");
        }
    }
}

