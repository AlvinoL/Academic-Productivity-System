public class Professor extends Colaboradores{
    private int idProfessor = 111;
    //private <vetor-Orientacoes> listaOrientacoes;
    //private <vetor-Publicacoes> listaPublicacoes;

    Professor(String nome, String email) {
        super(nome, email);
    }

    //metodos
    //gets()
    public int getIdProfessor() {
        return idProfessor;
    }

    //sets()
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
