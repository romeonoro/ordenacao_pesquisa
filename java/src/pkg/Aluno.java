package pkg;

/**
 * Representa um aluno com nome e idade.
 * Implementa a interface Comparable para permitir a comparação e ordenação de alunos.
 */
public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int idade;

    /**
     * Construtor da classe Aluno.

     * @param nome O nome do aluno.
     * @param idade A idade do aluno.
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {

        return "\nAluno [nome=" + nome + ", idade=" + idade + "]";

    }

    /**
     * Compara este aluno com outro aluno para fins de ordenação.
     * Ordena primeiro por nome e, em caso de duplicação, por idade.

     * @param outroAluno O outro aluno para comparação.
     * @return Um valor negativo, zero ou positivo conforme este aluno é menor, igual ou maior que o outro aluno.
     */
    @Override
    public int compareTo(Aluno outroAluno) {

        int nomeCompare = this.nome.compareTo(outroAluno.getNome());
        if (nomeCompare != 0) {
            return nomeCompare;
        } else {
            return Integer.compare(this.idade, outroAluno.getIdade());
        }

    }
}