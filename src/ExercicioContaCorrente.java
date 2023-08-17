public class ExercicioContaCorrente {
    public static void main(String [] args){
        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta("1232456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setSaldoDaConta(-10);

        System.out.println("saldo da conta  "+conta.getNumeroConta()+ " = " +conta.getSaldoDaConta());

        boolean saqueEfetuado = conta.realizarSaque(10);

        if(saqueEfetuado){
            System.out.println("saque realizado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("nao foi possivel realizar saque. saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("tentativa de saque de 500 reais");
        if(saqueEfetuado){
            System.out.println("saque efetuado com sucesso");
            conta.consultarSaldo();
        }else {
            System.out.println("nao foi possivel realizar saque. saldo insuficiente");
        }

        System.out.println("deposito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if(conta.verificarUsoChequeEspecial()){
            System.out.println("esta usando cheque especial");
        }else {
            System.out.println("nao esta usando cheque especial");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()){
            System.out.println("esta usando cheque especial");
        }else {
            System.out.println("nao esta usando cheque especial");
        }
    }
}
