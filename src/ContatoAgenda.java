public class ContatoAgenda {
    private String nome;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo (){
        return "\n"+"NOME:"+this.nome+"\n"+
                "TELEFONE:"+this.telefone+"\n"+
                "EMAIL:"+this.email+"\n";
    }
}
