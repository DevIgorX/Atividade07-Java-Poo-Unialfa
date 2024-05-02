package br.com.Exercicio02.TaxacaoImposto;

public class Importado extends  Produto {

    private double  taxa;
    private double taxaImportacao;

    Importado(String descricao, int valor){
        super( descricao, valor);
        this.setImposto(0.1);
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;

    }


    public double getTaxa(){
        return taxa;
    }
    public double getTaxaImportacao(){
        return taxaImportacao;
    }

    @Override
    public void relatorio() {
        System.out.println("Detalhes do Produto");
        System.out.println("descricao: " +getDescricao());
        System.out.println("valor: " +getValor());
        System.out.println("imposto: " +(+getImposto() *100)+"%");
        System.out.println("taxa: " +(+getTaxa() *100)+"%");
        System.out.println("taxa de importação: " +(+getTaxaImportacao() *100)+"%");
    }
}
