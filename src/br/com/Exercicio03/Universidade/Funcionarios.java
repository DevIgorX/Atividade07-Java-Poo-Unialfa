package br.com.Exercicio03.Universidade;


public class Funcionarios {

    private String nome;
    private int codigoDepartamento;
    private int faixaSalarial;
    private  String tipoFuncionario;


    Funcionarios(String nome, int codigoDepartamento ,int faixaSalarial,String tipoFuncionario ){
        this.nome = nome;
       this.codigoDepartamento = codigoDepartamento;
        this.faixaSalarial = faixaSalarial;
        this.tipoFuncionario = tipoFuncionario;
    }

    public String getNome(){

        return nome;
    }
    public int getCodigoDepartamento(){
        return codigoDepartamento;

    }

    public int getFaixaSalarial(){

        return faixaSalarial;
    }
    public String getTipoFuncionario(){

        return tipoFuncionario;
    }




}
