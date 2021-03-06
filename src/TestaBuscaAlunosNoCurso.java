public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 12345);
        Aluno a2 = new Aluno("Guilherme Silveira", 56483);
        Aluno a3 = new Aluno("Mauricio Aniche", 39485);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matrícula 12345?");
        Aluno aluno = javaColecoes.buscaMatriculado(12345);
        System.out.println("Aluno: " + aluno);
    }
}
