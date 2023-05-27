import java.util.Scanner;

public class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    String numeroConta;
    String numeroAgencia;
    double saldo;
    boolean especial;
    double limiteEspecial;


    boolean realizarSaque(double quantiaASacar){
        if (saldo>=quantiaASacar){ //tem saldo na conta
            saldo=saldo-quantiaASacar;
            return true;
        }else { //não tem saldo na conta
            if (especial){
                double limite = limiteEspecial+saldo;
                if (limite>=quantiaASacar){ //verificar se tem saldo no limite especial
                    saldo=saldo-quantiaASacar;
                    return true;
                }else {
                    return false;
                }
            }else {
                return false; //não é especial e não tem saldo suficiente
            }
        }

    }
    void depositar (double valorDepositado) {
        saldo=saldo+valorDepositado;

    }

    void consultarSaldo(){
        System.out.println("Saldo da conta: "+saldo);
    }
    boolean verificarUsoChequeEspecial(){
        return saldo<0;
    }
}
