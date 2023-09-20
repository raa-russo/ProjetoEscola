import java.util.ArrayList;
import java.util.List;

class Curso {
    private String nomeCurso;
    private List<Estudante> estudantesMatriculados;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.estudantesMatriculados = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        estudantesMatriculados.add(estudante);
    }

    public void removerEstudante(Estudante estudante) {
        estudantesMatriculados.remove(estudante);
    }

    public void listarEstudantesMatriculados() {
        System.out.println("Estudantes matriculados no curso " + nomeCurso + ":");
        for (Estudante estudante : estudantesMatriculados) {
            System.out.println("Nome: " + estudante.getNome() + ", Idade: " + estudante.getIdade() +
                    ", Número de Identificação: " + estudante.getNumeroIdentificacao());
        }
    }
}
