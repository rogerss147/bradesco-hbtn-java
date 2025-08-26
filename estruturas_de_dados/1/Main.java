public class Main {
    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();

        // Adicionando alunos
        gestao.adicionarAluno(new Aluno("Alice", 20));
        gestao.adicionarAluno(new Aluno("Bob", 22));
        gestao.adicionarAluno(new Aluno("Bruno", 24));

        // Listando alunos
        gestao.listarAlunos();

        // Buscando um aluno
        gestao.buscarAluno("Alice");

        // Excluindo um aluno
        gestao.excluirAluno("Bob");
        System.out.println("Após exclusão de Bob:");
        
        gestao.excluirAluno("Jinny"); // Tentativa de exclusão de aluno inexistente
        gestao.listarAlunos();
    }
}
