public class Contador {

    public Contador(){
        contagem++;
    }

    public static int contagem;
    public static void incrementar(){
        contagem++;
    }
    public static void zerar(){
        contagem=0;
    }
    public static int obterValor(){
        return contagem;
    }


}