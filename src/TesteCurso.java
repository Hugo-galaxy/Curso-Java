import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("entre com o nome do curso: ");
        String nome=scan.nextLine();

        System.out.println("digite o horario do curso:" );
        String horario=scan.nextLine();

        System.out.println("digite o nome do professor");
        String nomeProf=scan.nextLine();

        System.out.println("digite o departamento do professor");
        String depProf=scan.nextLine();

        System.out.println("digite o email do professor");
        String email=scan.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setDepartamento(depProf);
        professor.setEmail(email);
        professor.setNome(nomeProf);

        curso.setProfessor(professor); //seta as informações da classe professor para a classe curso que tem o tipo professor

        System.out.println("-ALUNOS-");

        Aluno[] alunos= new Aluno[5];
        for (int i=0;i<5;i++){

            scan.nextLine();

            System.out.println("nome do aluno "+(i+1));
            String nomeAluno=scan.nextLine();

            System.out.println("entre com a matricula do aluno");
            String matricula=scan.nextLine();

            double [] notas=new double[4];
            for (int j=0;j<4;j++){
                System.out.println("digite a nota "+(j+1));
                notas[j]=scan.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setMatricula(matricula);
            aluno.setNome(nomeAluno);
            aluno.setNotas(notas);

            alunos[i]=aluno;
        }
        curso.setAlunos(alunos);

        curso.obterInfo();
    }
}
