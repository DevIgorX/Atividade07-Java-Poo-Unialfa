package br.com.Exercicio02.TaxacaoImposto;

public class Nacional extends Produto {

    private double taxa;
    Nacional(String descricao, int valor){
        super(descricao, valor);
        this.taxa = 0.05;
        this.setImposto(0.1);

    }

    public double getTaxa(){
        return taxa;
    }

    @Override
    public void relatorio() {
        System.out.println("Detalhes do Produto");
        System.out.println("descricao: " +getDescricao());
        System.out.println("valor: " +getValor());
        System.out.println("imposto: " +(+getImposto() *100)+"%");
        System.out.println("taxa: "+ (+getTaxa() *100)+"%");
    }
}
