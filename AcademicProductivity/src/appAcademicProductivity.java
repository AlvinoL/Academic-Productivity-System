import java.util.Scanner;

public class appAcademicProductivity {
    public static void main(String[] args) {
        //criando colaboradores
        Professor profA = new Professor("Dumbledore", "dumbledore@email.com", null);
        Aluno alunoG = new Aluno("Alvino", "alvino@email.com", null, 0);
        Aluno alunoM = new Aluno("Pedro", "pedro@email.com", null, 1);
        Aluno alunoD = new Aluno("Duda", "duda@email.com", null, 2);
        Pesquisador pesq = new Pesquisador("Cristopher", "cristopher@email.com", null);

        ListaColaboradores listaProf = new ListaColaboradores(2);
//        ListaColaboradores listaAlunos = new ListaColaboradores(2);

        //criando Laboratorio
        Lab lab = new Lab(new ListaColaboradores(10), new ListaProjetos(10), new ProducaoAcademica(10, 10));

//        lab.setAllColabs(new ListaColaboradores(10));
        lab.allColabs.addColab(profA);
        listaProf.addColab(profA);
        lab.allColabs.addColab(alunoG);
        lab.allColabs.addColab(alunoM);
        lab.allColabs.addColab(alunoD);
        lab.allColabs.addColab(pesq);

        System.out.println("\n");
//        System.out.println(lab.toString());


        //tipos de entradas
        Scanner my_input = new Scanner(System.in);
        int num;
        String text;
        double numD;
        //////////////////

        //interface de usuario
        while (true){
            System.out.println("Digite um comando:\n");
            num = my_input.nextInt();
            my_input.nextLine(); // esvazia o buffer

            //fechar app
            if(num == 404){
                break;
            }

            //Criar Projeto
            if(num == 0){
                Projeto proj = new Projeto(null, null, null, null, 0.00, null, null, null, null, null);

                System.out.println("\nCriando Projeto...\n");
                System.out.println("Digite um Titulo:\n");
                text = my_input.nextLine();
                proj.setTitulo(text);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite a data de inicio no formato(dd-mm-aaaa):\n");
                text = my_input.nextLine();
                proj.setInicioData(text);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite a data de termino no formato(dd-mm-aaaa):\n");
                text = my_input.nextLine();
                proj.setTerminoData(text);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite a Agencia Financiadora:\n");
                text = my_input.nextLine();
                proj.setAgFinanciadora(text);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite o Valor Financiado:\n");
                numD = my_input.nextDouble();
                proj.setValorFinanciado(numD);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite o Objetivo:\n");
                text = my_input.nextLine();
                proj.setObjetivo(text);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite a Descrição:\n");
                text = my_input.nextLine();
                proj.setDescricao(text);

                my_input.nextLine(); // esvazia o buffer

                System.out.println("Digite o codigo do Professor Responsavel:\n");
                for(int i = 0; i < listaProf.getListaColaboradores().length; i++){
                    if(listaProf.getListaColaboradores()[i] != null){
                        System.out.println("code:" + listaProf.getListaColaboradores()[i].getId() + " - " + "Professor:" + listaProf.getListaColaboradores()[i].getNome());
                    }
                }
                num = my_input.nextInt();
                proj.setProfessorResponsavel((Professor) listaProf.getListaColaboradores()[num]);
                //lista colaboradores current
                ListaColaboradores curr_part = new ListaColaboradores(10);
                //Projeto pode ter até 5 orientações e 2 publicações
                ProducaoAcademica curr_prod = new ProducaoAcademica(5, 2);
                curr_part.addColab(proj.getProfessorResponsavel());

                my_input.nextLine(); // esvazia o buffer

                while (true){
                    System.out.println("Deseja adicionar mais algum colaborador ao Projeto? Digite 0: Sim ; 1:Não\n");
                    num = my_input.nextInt();

                    if (num == 1){
                        break;
                    }
                    my_input.nextLine(); // esvazia o buffer

                    System.out.println("Digite o codigo do Colaborador:\n");
                    for(int i = 0; i < lab.allColabs.getListaColaboradores().length; i++){
                        if(lab.allColabs.getListaColaboradores()[i] != null){
                            // se Aluno
                            if((lab.allColabs.getListaColaboradores()[i]) instanceof Aluno){
                                // se Aluno de Graduação
                                if(((Aluno)lab.allColabs.getListaColaboradores()[i]).getTypeAluno() == 0){
                                    // se o Aluno não possui projeto
                                    if(((Aluno)lab.allColabs.getListaColaboradores()[i]).getBusy() == false){
                                        System.out.println("code:" + lab.allColabs.getListaColaboradores()[i].getId() + " - " + "Aluno de Graduação:" + lab.allColabs.getListaColaboradores()[i].getNome());
                                    }
                            }
                                //se Aluno de Mestrado
                                if(((Aluno)lab.allColabs.getListaColaboradores()[i]).getTypeAluno() == 1){
                                    System.out.println("code:" + lab.allColabs.getListaColaboradores()[i].getId() + " - " + "Aluno de Mestrado:" + lab.allColabs.getListaColaboradores()[i].getNome());
                                    }
                                //se Aluno de Doutorado
                                if(((Aluno)lab.allColabs.getListaColaboradores()[i]).getTypeAluno() == 2){
                                    System.out.println("code:" + lab.allColabs.getListaColaboradores()[i].getId() + " - " + "Aluno de Doutorado:" + lab.allColabs.getListaColaboradores()[i].getNome());
                                }
                                }


                            if((lab.allColabs.getListaColaboradores()[i]) instanceof Professor){
                                System.out.println("code:" + lab.allColabs.getListaColaboradores()[i].getId() + " - " + "Professor:" + lab.allColabs.getListaColaboradores()[i].getNome());

                            }
                            if((lab.allColabs.getListaColaboradores()[i]) instanceof Pesquisador){
                                System.out.println("code:" + lab.allColabs.getListaColaboradores()[i].getId() + " - " + "Pesquisador:" + lab.allColabs.getListaColaboradores()[i].getNome());
                            }
                        }

                    }
                    //recebe o colaborador do teclado
                    num = my_input.nextInt();
                    my_input.nextLine(); // esvazia o buffer
                    if((lab.allColabs.getListaColaboradores()[num]) instanceof Aluno){
                        //indica que o aluno está alocado a um projeto
                        ((Aluno)lab.allColabs.getListaColaboradores()[num]).setBusy(true);
                        //atribui o Aluno ao par Orientação
                        Orientacao currOrient = new Orientacao(null, ((Aluno)lab.allColabs.getListaColaboradores()[num]));
                        curr_part.addColab(lab.allColabs.getListaColaboradores()[num]);
                        System.out.println("Escolha um Professor na lista acima como orientor desse Aluno:\n");
                        num = my_input.nextInt();
                        //cria par Orientação atual
                        currOrient.setOrientador(((Professor)lab.allColabs.getListaColaboradores()[num]));
                        //add Orientação a Lista atual
                        curr_prod.addOrientacao(currOrient);
                        lab.allProdAcad.addOrientacao(currOrient);
                        //add Orientação aos participantes
//                        Professor curr;
//                        curr = lab.allColabs.getListaColaboradores()[currOrient.getOrientador().id];

                    }
                    else {
                        curr_part.addColab(lab.allColabs.getListaColaboradores()[num]);
                    }

                    my_input.nextLine(); // esvazia o buffer
                }

                //add participantes a instancia projeto
                proj.setParticipantes(curr_part);
                //add Orientações a Produção Academica do Projeto
                proj.setProjProdAcad(curr_prod);
                //add Projeto a Lista de Projetos do Lab
                lab.allProjs.addProjeto(proj);


            }


            if(num == 1){
                //editar Projeto
                
            }

            if(num == 2){
                //consultar colaborador
            }

            if(num == 3){
                //Consultar Projeto
            }

            if(num == 4){
                //Relatorio de Produção Academica do Lab
            }

        } // fim do while de programa

        System.out.println("\n");
//        System.out.println(lab.toString());
        System.out.println(lab.getAllColabs());
        System.out.println("\n");
        System.out.println(lab.getAllProjs());
        System.out.println("\n");
        System.out.println(lab.getAllProdAcad());
    }
}
