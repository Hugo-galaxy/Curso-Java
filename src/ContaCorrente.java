public class ContaCorrente {
    private String numeroConta;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldoDaConta;
    public ContaCorrente() {

    }

    public ContaCorrente(String numeroConta,String agencia, boolean especial, double limiteEspecial, double saldoDaConta){
        this.numeroConta=numeroConta;
        this.agencia=agencia;
        this.especial=especial;
        this.limiteEspecial=limiteEspecial;
        this.saldoDaConta=saldoDaConta;
    }

    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String numero){
        this.numeroConta=numeroConta;
    }

    public String getAgencia(){
        return agencia;
    }
    public void setAgencia(String numeroAgencia){
        this.agencia=agencia;
    }

    public boolean isEspecial(){
        return especial;
    }
    public void setEspecial(boolean contaEspecial){
        this.especial=especial;
    }

    public double getLimiteEspecial(){
        return limiteEspecial;
    }

    public void setLimiteEspecial(double valorLimiteEspecial){
        this.limiteEspecial=limiteEspecial;
    }

    public double getSaldoDaConta(){

        return saldoDaConta;
    }

    public void setSaldoDaConta(double valorSaldoDaConta){

        this.saldoDaConta=saldoDaConta;
    }

    public boolean realizarSaque (double quantiaASacar){
        if (saldoDaConta>=quantiaASacar){  //tem saldo na conta
            saldoDaConta=saldoDaConta-quantiaASacar;
            return true;
        } else{ //nao tem saldo na conta
            if (especial){ //verifica se o limite especial tem saldo
                double limite=limiteEspecial+saldoDaConta;
                if (limite>=quantiaASacar){
                    saldoDaConta-=quantiaASacar;
                    return true;
                } else {
                    return false; //nao tem saldo no limite especial
                }
            } else {
                return false;  //nao é especial e nao tem saldo suficiente
            }
        }
    }

    public void depositar(double valorDepositado){

        saldoDaConta+=valorDepositado;
    }

    public void consultarSaldo(){

        System.out.println("saldo da conta é: "+saldoDaConta);
    }

    public boolean verificarUsoChequeEspecial(){

        return saldoDaConta<0;
    }



}

