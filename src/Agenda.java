public class Agenda {
    private ContatoAgenda[] contato;
    private String nomeAgenda;

    public Agenda (){

    }
    public Agenda (String nomeAgenda){
        this.nomeAgenda=nomeAgenda;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public ContatoAgenda[] getContato() {
        return contato;
    }

    public void setContato(ContatoAgenda[] contato) {
        this.contato = contato;
    }

    public String obterInfo(){
        String info="NOME:"+nomeAgenda+"\n";
        if (contato!=null){
            for (ContatoAgenda c : contato){
                info+= c.obterInfo()+"\n";
            }
        }
        return info;
    }
}
