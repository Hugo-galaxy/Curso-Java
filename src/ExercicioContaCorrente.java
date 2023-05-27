public class ExercicioContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numeroConta = "123456";
        conta.numeroAgencia = "123456";
        conta.especial = true;
        conta.limiteEspecial=500;
        conta.saldo= -10;

        boolean saqueEfetuado = conta.realizarSaque(10);
        conta.consultarSaldo();

        if (saqueEfetuado){
            System.out.println("saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("tentativa de realizar saque de 500");
        if (saqueEfetuado){
            System.out.println("saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("saldo insuficiente");
        }

        System.out.println("deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("está usando cheque especial");
        } else {
            System.out.println("não está usando cheque especial");
        }
        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()){
            System.out.println("esta usando cheque especial");
        } else {
            System.out.println("não esta usando cheque especial");
        }
    }
}
