public class Main {
    public static void main(String[] args) {
        // Criando objetos Estudante
        Estudante estudante1 = new Estudante("Alice", 20, 1001);
        Estudante estudante2 = new Estudante("Bob", 22, 1002);
        Estudante estudante3 = new Estudante("Carol", 21, 1003);

        // Criando objetos Curso
        Curso curso1 = new Curso("Engenharia Civil");
        Curso curso2 = new Curso("Ciência da Computação");

        // Matriculando estudantes nos cursos
        System.out.printf("\nMatriculando Alunos!\n");
        curso1.adicionarEstudante(estudante1);
        curso1.adicionarEstudante(estudante2);
        curso2.adicionarEstudante(estudante2);
        curso2.adicionarEstudante(estudante3);

        // Listando estudantes matriculados nos cursos antes de remover
        System.out.printf("\nListando todos os alunos matriculados!\n");
        curso1.listarEstudantesMatriculados();
        curso2.listarEstudantesMatriculados();

        // Removendo um estudante do curso
       curso1.removerEstudante(estudante2);

        // Listando estudantes matriculados nos cursos após a remoção
        System.out.printf("\nListando alunos apos remoção!\n");
        curso1.listarEstudantesMatriculados();
        curso2.listarEstudantesMatriculados();
    }
}

