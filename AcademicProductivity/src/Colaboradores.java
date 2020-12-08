public class Colaboradores {
    protected String nome;
    protected String email;

    //construtor
    Colaboradores(String nome, String email){
        this.nome = nome;
        this.email = email;
    }


//metodos

    //gets()
    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    //sets()
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
