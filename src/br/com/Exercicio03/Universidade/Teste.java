package br.com.Exercicio03.Universidade;


 import java.util.ArrayList;
 import java.util.Scanner;


 class Universidade {

  public ArrayList<Departamentos> DepartamensoUniversidade = new ArrayList<>();
  public ArrayList<Funcionarios> funcionarios = new ArrayList<>();

  Universidade(){
      DepartamensoUniversidade.add(new Departamentos(1901,"Financeiro",1400));
      DepartamensoUniversidade.add(new Departamentos(1902,"RH",2000));
      DepartamensoUniversidade.add( new Departamentos(1903,"Administrativo",7392));
      DepartamensoUniversidade.add(new Departamentos(1904,"Produção",1400));

      funcionarios.add(new Funcionarios("Tauam Igor",1901,3768,"Docente"));
      funcionarios.add(new Funcionarios("Marcos Dias",1902,2000,"Técnico"));
      funcionarios.add(new Funcionarios("Luis Carlos",1902,2000,"Docente"));

  }

  public void cadastrarDepartamento(int codigo, String nomeDepatamento, int gasto){

      DepartamensoUniversidade.add( new Departamentos(codigo, nomeDepatamento, gasto));
  }
     public void cadastrarDepat(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o Código do Depatamento");
         int codigo = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Digite o nome do Depatamento");
         String nomeDep = scanner.nextLine();
         System.out.println("Digite o Gasto total do Departamento");
         int gasto = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Cadastrando Departamento...");
         cadastrarDepartamento(codigo, nomeDep, gasto);
         System.out.println("Departamento Cadastrado com Sucesso");
         retorno();

     }

     public  void listarDepartamentos(){
       for(int i = 0; i < DepartamensoUniversidade.size(); i++){
        System.out.println((i+ 1)+". nome do Departamento: "+ DepartamensoUniversidade.get(i).getNomeDepartamento());
        System.out.println("Código: " +DepartamensoUniversidade.get(i).getCodigo());
        System.out.println("Total de Gasto: " +DepartamensoUniversidade.get(i).getGastoTotal());
       }
       retorno();
    }
     public void listarFuncionarios(){
         for (int i = 0; i < funcionarios.size(); i++){
             System.out.println((i+1)+". "+funcionarios.get(i).getNome()+" - "+funcionarios.get(i).getCodigoDepartamento()+" - "+funcionarios.get(i).getTipoFuncionario()+" - "+funcionarios.get(i).getTipoFuncionario());
         }
         retorno();
     }

     public void listarDocentes(){

      for (int i  = 0; i < funcionarios.size();i++){
          if(funcionarios.get(i).getTipoFuncionario().equalsIgnoreCase("Docente")){
              System.out.println((i+1)+". "+funcionarios.get(i).getNome());
          }
      }

      retorno();
     }

     public void listarTecnico(){

         for (int i  = 0; i < funcionarios.size();i++){
             if(funcionarios.get(i).getTipoFuncionario().equalsIgnoreCase("Técnico")){
                 System.out.println((i+1)+". "+funcionarios.get(i).getNome());
             }
         }

         retorno();
     }



     public void listartodosDepartamentoseFuncionarios(){

      for (int i = 0; i < DepartamensoUniversidade.size(); i++){
          System.out.println("No Departamento: "+DepartamensoUniversidade.get(i).getNomeDepartamento());
          System.out.println("Temos os Funcionários");

          for (int item = 0; item < funcionarios.size(); item++){
              if(funcionarios.get(item).getCodigoDepartamento() == DepartamensoUniversidade.get(i).getCodigo()){
                  System.out.println(funcionarios.get(item).getNome());
              }
          }
      }
      retorno();

     }

    public void cadastroFun(){
      Scanner scanner = new Scanner(System.in);

        System.out.println("digite o nome do Funcionario");
        String nome = scanner.nextLine();
        System.out.println("Digite o codigo do departamento");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a faixa salarial");
        int faixa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Funcionario Docente ou Técnino?");
        String nome2 = scanner.nextLine();
        System.out.println("Cadastrando Funcionario...");
        cadastrarFuncionario(nome, codigo, faixa,nome2);
        System.out.println("Funcionario Cadastrado com Sucesso!");
        retorno();



    }

    public void retorno(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja voltar ao Menu? 1-Sim  2-Não");
        int retorno = scanner.nextInt();

        if (retorno == 1){
            menu();
        }else if (retorno == 2){
            System.out.println("Ok, Saindo...");
            scanner.close();
        }else {
            System.out.println("Respota Invalida, tente novamente!");
            retorno();
        }
    }

    public void cadastrarFuncionario(String nome, int codigoDepartamento ,int faixaSalarial,String tipoFuncionario ){
      funcionarios.add( new Funcionarios(nome, codigoDepartamento, faixaSalarial, tipoFuncionario));
    }



    public void buscarDepatamentoPorNome(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Departamento que desejar encontrar ");
        String nomeDepatamento = scanner.nextLine();
        boolean departamentoEncontrado = false;
        for(int i = 0; i < DepartamensoUniversidade.size(); i++){
            if(DepartamensoUniversidade.get(i).getNomeDepartamento().toLowerCase().equals(nomeDepatamento.toLowerCase()) ){
                System.out.println(DepartamensoUniversidade.get(i).getCodigo()+" - "+ DepartamensoUniversidade.get(i).getNomeDepartamento()+" - "+DepartamensoUniversidade.get(i).getGastoTotal());
                departamentoEncontrado = true;
            }

        }
        if(!departamentoEncontrado){
            System.out.println("Departamento não localizado!");
            System.out.println("Deseja tentar novamente? digite: 1");
            System.out.println("Voltar ao Menu Princial? digite: 2");
            int resposta = scanner.nextInt();
            if (resposta == 1){
                buscarDepatamentoPorNome();
            }else {
                menu();
            }

        }
        retorno();

    }

    public void buscarFuncionarioPorNome(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do Funcionario");
        String nome = scanner.nextLine();
        boolean funcionarioEncontrado = false;

        for (Funcionarios funcionario : funcionarios) {
            if(funcionario.getNome().equalsIgnoreCase(nome)){
                System.out.println("Funcionario: "+ funcionario.getNome() + " Tipo: " +funcionario.getTipoFuncionario()+ " Departamento: " + funcionario.getCodigoDepartamento() +" Faixa Salarial: " +funcionario.getFaixaSalarial() );
                funcionarioEncontrado = true;
            }
        }

        if(!funcionarioEncontrado){
            System.out.println("Funcionário não localizado!");
            System.out.println("Deseja tentar novamente? digite: 1");
            System.out.println("Voltar ao Menu Princial? digite: 2");
            int resposta = scanner.nextInt();

            if(resposta == 1){
                buscarDepatamentoPorNome();
            }else {
                menu();
            }
        }
        retorno();

    }

    public void listaFuncionariosFaixaSalarial (){
      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Faixa Salarial Especifica para Encontrar os Funcionários");
        int faixaSalarial = scanner.nextInt();
        int totalFuncionarios  = 0;
        boolean funcionariosEncontrados = false;

        for (Funcionarios funcionario : funcionarios){
            if(funcionario.getFaixaSalarial() == faixaSalarial){
                System.out.println("Funcionario: "+ funcionario.getNome() + " - Tipo: " +funcionario.getTipoFuncionario()+ " - Codigo do Departamento: " + funcionario.getCodigoDepartamento() +" - Faixa Salarial: " +funcionario.getFaixaSalarial() );
                funcionariosEncontrados = true;
                totalFuncionarios++;
            }
        }

        System.out.println("Temos: " +totalFuncionarios+ " Funcionários dentro dessa Faixa Salarial");

        if(!funcionariosEncontrados){
            System.out.println("Funcionários não localizados!");
            System.out.println("Deseja tentar novamente? digite: 1");
            System.out.println("Voltar ao Menu Princial? digite: 2");
            int resposta = scanner.nextInt();

            if(resposta == 1){
                buscarDepatamentoPorNome();
            }else if(resposta == 2){
                menu();
            }else {
                System.out.println("Respota incorreto, escolha uma das opções do menu!");
            }
        }
        retorno();

    }

    public void buscarDepartamentoPorCodigo(int numero){

      boolean departamentoEncontrado = false;
        for (Departamentos departamento : DepartamensoUniversidade){
            if (departamento.getCodigo() == numero){
                System.out.println(departamento.getNomeDepartamento());
            }
        }

    }

    public void listarDepartamentoDeFuncionariosFaixaSalarialEspecifica(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a faixa salarial específica dos funcionários para locar os Departamentos");
        int faixa = scanner.nextInt();
        boolean faixalocalizada = false;

        for (Funcionarios funcionario: funcionarios){
            if (funcionario.getFaixaSalarial() == faixa){
                buscarDepartamentoPorCodigo(funcionario.getCodigoDepartamento());
                faixalocalizada = true;
            }
        }
        if (!faixalocalizada){
            System.out.println("Departamentos não localizados!");
            System.out.println("Deseja tentar novamente? digite: 1");
            System.out.println("Voltar ao Menu Princial? digite: 2");
            int resposta = scanner.nextInt();
            if (resposta == 1){
                listarDepartamentoDeFuncionariosFaixaSalarialEspecifica();
            }else if(resposta == 2){
                menu();
            }else {
                System.out.println("Respota invalida, escolha uma das opções do menu!");
            }

        }
        retorno();




    }

    public void listarDepartamentocomGastoEspecifico(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma faixa salarial específica");

        if (scanner.hasNextInt()) {
            int gastototal = scanner.nextInt();
            int contador = 1;
            boolean departamentoEncontrado = false;
            for (Departamentos departamento : DepartamensoUniversidade){
                if (departamento.getGastoTotal() == gastototal){
                    System.out.println((contador++) +". "+departamento.getNomeDepartamento());
                    departamentoEncontrado = true;
                }
            }

            if(!departamentoEncontrado){
                System.out.println("Departamento não encontrando");
                System.out.println("Deseja tentar novamente? digite: 1");
                System.out.println("Voltar ao Menu Princial? digite: 2");
                int resposta = scanner.nextInt();

                if (resposta == 1){
                    listarDepartamentocomGastoEspecifico();
                }else if( resposta == 2){
                    menu();
                }else {
                    System.out.println("Respota invalida. seleciona uma das opções do menu!");
                }

            }
            retorno();
        }else {
            System.out.println("Reposta inválida. Por favor, selecione uma das opções do menu!");
        }


    }


    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá Seja Bem-vindo ao nosso sistema!");
        System.out.println("Menu de Opções");
        System.out.println("1- Cadastrar Departamento");
        System.out.println("2- Cadastrar Funcionário Técnico/Docente");
        System.out.println("3- Buscar Departamento por Nome");
        System.out.println("4- Buscar Funcionário por Nome");
        System.out.println("5- Listar Funcionários com Faixa Salarial Específica");
        System.out.println("6- Listar Departamentos com Funcionários com Faixa Salarial Específica");
        System.out.println("7- Listar Depatamentos cujo gasto total está entre uma Faixa Salarial Específica");
        System.out.println("8-  Listar todos Funionários da Universidade");
        System.out.println("9- Listar todos Departamentos da Universidade");
        System.out.println("10- Listar todos Departamentos da Universidade e seus Respectivos Funcionários");
        System.out.println("11- Listar todos Funcionários Docente");
        System.out.println("12- Listar todos Funcionários Técnico");
        System.out.println("0- Sair");

        int resposta = scanner.nextInt();

        switch (resposta){
            case 1 :
                cadastrarDepat();
                break;
            case 2 :
                cadastroFun();
                break;
            case 3 :
                buscarDepatamentoPorNome();
                break;
            case 4 :
                buscarFuncionarioPorNome();
                break;
            case 5 :
                listaFuncionariosFaixaSalarial();
                break;
            case 6 :
                listarDepartamentoDeFuncionariosFaixaSalarialEspecifica();
                break;
            case 7 :
                listarDepartamentocomGastoEspecifico();
                break;
            case 8 :
                listarFuncionarios();
                break;
            case 9 :
                listarDepartamentos();
                break;
            case 10 :
                listartodosDepartamentoseFuncionarios();
                break;
            case 11 :
                listarDocentes();
                break;
            case 12 :
                listarTecnico();
                break;

            case 0 :
                System.out.println("Tchauuuu!!!");
                scanner.close();
                break;

            default:
                System.out.println("Resposta invalida, escolha uma das opções do Menu!");
        }

    }



}



public class Teste {

    public static void main(String[] args) {

        Universidade universidade = new Universidade();
        universidade.menu();

//


    }



}
