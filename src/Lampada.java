import java.util.Scanner;

public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String [] tipos;
    //encapsulamento
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public String getTensao(){
        return tensao;
    }

    public void setTensao(String tensao){
        this.tensao=tensao;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia=potencia;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor=cor;
    }

    public String getTipoLuz(){
        return tipoLuz;
    }

    public void setTipoLuz (String tipoLuz){
        this.tipoLuz=tipoLuz;
    }

    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses=garantiaMeses;
    }

    public String [] getTipos(){
        return tipos;
    }

    public void setTipos(String [] tipos){
        this.tipos=tipos;
    }

    private boolean ligada=true;

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }


    public void ligar(){
        setLigada(true);
    }
    public void desligar(){
        setLigada(false);
    }
   public void exibirOpcao (){
        System.out.println("digite 1 para ligar e 0 para desligar");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        switch (option){
            case 0:
                desligar();
                System.out.println("lampada desligada");
                break;
            case 1:
                ligar();
                System.out.println("lampada ligada");
                break;
            default:
                System.out.println("opçao invalida");
        }
    }
}
