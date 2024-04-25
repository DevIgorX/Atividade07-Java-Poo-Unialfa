package br.com.Exercicio02.TaxacaoImposto;

public  abstract class Produto {
    private String descricao;
    private int valor;
    private double imposto;

    Produto(String descricao, int valor ){
        this.descricao = descricao;
        this.valor = valor;
    }


    public String getDescricao(){
        return descricao;
    }

    public int getValor(){
        return valor;
    }

    public double getImposto(){
        return imposto;
    }

    public void setImposto(double imposto){
        this.imposto = imposto;
    }


    public abstract void relatorio();


}
