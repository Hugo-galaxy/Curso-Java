public class TesteContato {
    public static void main(String[] args) {
        Contato contat = new Contato();
        contat.setNome("maycon");
        //contat.setTelefone("99999999");

        //relacionamento tem um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua das amoras");
        end.setNumeroRua("222");
        end.setEstado("Minas Gerais");
        end.setCep("99999999");
        end.setComplemento("-");

        contat.setEndereco(end);

        //relacionamento tem um telefone
        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setNumeroTelefone("9999-9999");
        tel.setDdd("99");

        Telefone tel2 = new Telefone();
        tel2.setTipo("residencial");
        tel2.setNumeroTelefone("91111-9999");
        tel2.setDdd("88");
        //mais de um telefone
        Telefone[] telefones = new Telefone[2];
        telefones[0]=tel;
        telefones[1]=tel2;

        //contat.setTelefone(tel);
        contat.setTelefones(telefones);

        //teste saida no console
        System.out.println(contat.getNome());
        if (contat !=null && contat.getEndereco() != null){      //verificação para a saida não dar null pointer, tratamento de erro
            System.out.println(contat.getEndereco().getEstado());
        }

        /*if (contat!=null && contat.getTelefone()!=null){
            System.out.println(contat.getTelefone().getDdd()+" "+contat.getTelefone().getNumeroTelefone());
        }*/

        if (contat!=null && contat.getTelefones()!=null){
            for (Telefone t : contat.getTelefones()){
                System.out.println(t.getDdd()+" "+t.getNumeroTelefone());
            }
        }


    }
}
