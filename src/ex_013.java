public class ex_013 {
    public static void main (String[] args){
        int numero1=10,numero2=13,numero3=20;
        if (numero1>=numero2 && numero1>=numero3){
            System.out.printf("%d é maior",numero1);
        }else if (numero2>=numero1 && numero2>=numero3) {
            System.out.printf("%d é maior",numero2);
        }
        else{
         System.out.printf("%d é maior",numero3);
        }
    }
}
