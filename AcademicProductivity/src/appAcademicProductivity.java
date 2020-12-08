public class appAcademicProductivity {
    public static void main(String[] args) {
        // teste colaboradores
        Professor profA = new Professor("Leandro", "leandro@email.com");
        System.out.println(profA.toString());


        Aluno alunoA = new Aluno("Alvino", "alvino@email.com");
        System.out.println("\n");
        System.out.println(alunoA.toString());

        Pesquisador pesqA = new Pesquisador("Sam", "sam@email.com");

        System.out.println("\n");
        System.out.println(pesqA.toString());

        //teste Projeto
        Projeto proj = new Projeto("new smartwatch", "07-12-2020", "08-12-2021", "Samsung", 1000000.00, "Desenvolver o novo smartwatch Samsung", "text-description", profA);
        System.out.println("\n");
        System.out.println(proj.toString());

        //teste Orientacao e Publicacao
        Orientacao orientA = new Orientacao(profA, alunoA);
        Publicacao pubA = new Publicacao("The new Smartwatch", "SamsungConference", 2020, proj);
        System.out.println("\n");
        System.out.println(orientA.toString());
        System.out.println(pubA.toString());

        //teste ProducaoAcademica
        ProducaoAcademica prodList = new ProducaoAcademica(2, 1);
        prodList.addOrientacao(orientA);
        prodList.addPublicacao(pubA);

        System.out.println("\n");
        System.out.println(prodList.toString());
//      System.out.println("Teste vetor Lista: "+prodList.getListaPublicacao()[0]);

        //teste ListaProjetos
        ListaProjetos my_projlist = new ListaProjetos(2);
        my_projlist.addProjeto(proj);
        System.out.println("\n");
        System.out.println(my_projlist.toString());

        //teste ListaColaboradores
        ListaColaboradores my_colablist = new ListaColaboradores(3);
        my_colablist.addColab(profA);
        my_colablist.addColab(alunoA);
        my_colablist.addColab(pesqA);
        System.out.println("\n");
        System.out.println(my_colablist.toString());
        System.out.println("\n");
        System.out.println(my_colablist.getListaColaboradores()[1]);

    }
}
