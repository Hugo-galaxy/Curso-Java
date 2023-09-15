import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;

        System.out.println("digite o nome da agenda");
        nome = scan.nextLine();
        Agenda agenda = new Agenda(nome);

        //Agenda agenda = new Agenda();
        //agenda.setNomeAgenda(nome);    poderia ser dessa forma também

        ContatoAgenda[] contatos = new ContatoAgenda[3];
        for (int i=0;i<3;i++){
            System.out.println("entre com as informações do contato"+(i+1));
            ContatoAgenda c = new ContatoAgenda();

            System.out.println("NOME: ");
            nome=scan.nextLine();
            c.setNome(nome);
            System.out.println("TELEFONE");
            String telefone=scan.nextLine();
            c.setTelefone(telefone);
            System.out.println("EMAIL");
            String email=scan.nextLine();
            c.setEmail(email);

            contatos[i]=c;  //jogar as informaçoes do contato "c" para o array contatos
        }
        agenda.setContato(contatos);
        if (agenda!=null){
            System.out.println(agenda.obterInfo());
        }
    }
}
