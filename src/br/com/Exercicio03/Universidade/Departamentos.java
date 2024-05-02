package br.com.Exercicio03.Universidade;


public class Departamentos {

    private int codigo;
    private String nomeDepartamento;

    private int gastoTotal;


    Departamentos(int codigo, String nomeDepartamento, int gastoTotal){
        this.codigo  = codigo;
        this.nomeDepartamento = nomeDepartamento;
        this.gastoTotal = gastoTotal;
    }

    public int getCodigo(){
        return codigo;
    }
    public String getNomeDepartamento(){
        return  nomeDepartamento;
    }
    public int getGastoTotal(){
        return gastoTotal;
    }


}
