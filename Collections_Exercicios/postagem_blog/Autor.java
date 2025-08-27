/*
 * Implementation of the Autor class.
 * Represents an author with a name and surname.    
 * 
 * The Autor class implements Comparable to allow sorting by name and surname.
 * It overrides equals to ensure two authors with the same name and surname are considered equal.
*/
public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor outro) {
        int nomeComparison = this.nome.compareTo(outro.nome);
        if (nomeComparison != 0) {
            return nomeComparison;
        }
        return this.sobrenome.compareTo(outro.sobrenome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.nome.equals(outro.nome) && this.sobrenome.equals(outro.sobrenome);
    }
}
