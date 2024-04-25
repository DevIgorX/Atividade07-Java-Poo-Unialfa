package br.com.Exercicio02.TaxacaoImposto;

public class Estadual extends Produto {


    Estadual(String descricao, int valor) {
        super(descricao, valor);
        this.setImposto(0.1);
    }

    @Override
    public void relatorio() {
        System.out.println("Detalhes do Produto");
        System.out.println("descricao: " +getDescricao());
        System.out.println("valor: " +getValor());
        System.out.println("imposto: " + (+getImposto() *100)  +"%");

    }
}

