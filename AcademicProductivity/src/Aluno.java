public class Aluno extends Colaboradores{
    private int typeAluno = 0; // Graduação: 0;     Mestrado: 1;    Doutorado: 2;
    private int idAluno = 123;
    private boolean busy = false;
    //private <vetor-Orientacoes> listaOrientacoes;
    //private <vetor-Publicacoes> listaPublicacoes;

    Aluno(String nome, String email) {
        super(nome, email);
    }

//metodos

    //gets()
    public int getTypeAluno() {
        return typeAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public boolean getBusy(){
        return busy;
    }

    //sets()
    public void setTypeAluno(int typeAluno) {
        this.typeAluno = typeAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "typeAluno=" + typeAluno +
                ", idAluno=" + idAluno +
                ", busy=" + busy +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
