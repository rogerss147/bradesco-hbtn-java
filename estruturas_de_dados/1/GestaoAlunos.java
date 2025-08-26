import java.util.ArrayList;

public class GestaoAlunos {
    private ArrayList<Aluno> alunos;

    public GestaoAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void excluirAluno(String nome) {
        Aluno aluno = buscarAluno(nome);
        if (aluno != null) {
            alunos.remove(aluno);
        }
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        }else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno);
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado.");
        return null;
    }
}
