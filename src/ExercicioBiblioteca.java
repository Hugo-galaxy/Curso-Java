public class ExercicioBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nomeLivro="Lado bom da vida";
        livro.nomeAutor="Matthew Quick";
        livro.ano=2008;
        livro.emprestado=true;

        System.out.println("nome do livro="+livro.nomeLivro);
    }
}
