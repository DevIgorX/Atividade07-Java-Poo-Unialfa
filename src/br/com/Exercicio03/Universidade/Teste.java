package br.com.Exercicio03.Universidade;

 import java.util.ArrayList;
 import java.util.Scanner;


 class Universidade {

  public   ArrayList<Departamentos> DepartamensoUniversidade = new ArrayList<>();

  public ArrayList<Funcionarios> funcionarios = new ArrayList<>();

  Universidade(){
      DepartamensoUniversidade.add(new Departamentos(1901,"Financeiro",1400));
      DepartamensoUniversidade.add(new Departamentos(1902,"RH",2000));
      DepartamensoUniversidade.add( new Departamentos(1903,"Administrativo",7392));
      DepartamensoUniversidade.add(new Departamentos(1904,"Produção",6547));
  }


  public void cadastrarDepartamento( Departamentos departamento){
    DepartamensoUniversidade.add(departamento);
  }

     public  void listarDepartamentos(){
       for(int i = 0; i < DepartamensoUniversidade.size(); i++){
        System.out.println((i+ 1)+". nome do Departamento: "+ DepartamensoUniversidade.get(i).getNomeDepartamento());
        System.out.println("Código: " +DepartamensoUniversidade.get(i).getCodigo());
        System.out.println("Total de Gasto: " +DepartamensoUniversidade.get(i).getGastoTotal());
       }
    }

    public void cadastro(){
      Scanner scanner = new Scanner(System.in);

        System.out.println("digite o nome do Funcionario");
        String nome = scanner.nextLine();
        System.out.println("Digite o codigo do departamento");
        int codigo = scanner.nextInt();
        System.out.println("Digite a faixa salarial");
        int faixa = scanner.nextInt();
        System.out.println("Funcionario Docente ou Técnino?");
        String tipo = scanner.nextLine();

        cadastrarFuncionario(nome, codigo, faixa, tipo);
        System.out.println("Funcionario Cadastrado com Sucesso!");

    }


    public void cadastrarFuncionario(String nome, int codigoDepartamento ,int faixaSalarial,String tipoFuncionario ){
      funcionarios.add( new Funcionarios(nome, codigoDepartamento, faixaSalarial, tipoFuncionario));
    }

    public void listarFuncionarios(){
      for (int i = 0; i < funcionarios.size(); i++){
          System.out.println((i+1)+". "+funcionarios.get(i).getNome());
        }
    }



}



public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Universidade universidade = new Universidade();

//        Departamentos comercial = new Departamentos(1903,"Comercial", 1787);
//
//
//        universidade.cadastrarDepartamento(comercial);
//        universidade.listarDepartamentos();


        System.out.println("Olá Seja Bem-vindo ao nosso sistema, deseja cadastrar um funcionario novo?");
        String resposta = scanner.nextLine();

        if(resposta.toLowerCase().trim().equals("sim")){
            universidade.cadastro();
        }else {
            System.out.println("Ok, saindo...");
        }





    }



}
