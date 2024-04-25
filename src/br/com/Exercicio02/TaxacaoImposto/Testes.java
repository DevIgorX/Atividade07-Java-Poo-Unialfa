package br.com.Exercicio02.TaxacaoImposto;



public class Testes {
    public static void main(String[] args) {
        Produto geladeira = new Estadual("Geladeira/Refrigerador Electrolux Multidoor - 590L Efficient IM8S",6509);
        Produto fogao = new Nacional("Fogão 5 Bocas A Gás Itatiaia Electra Glass Mesa De Vidro E Acendimento Automático Preto Bivolt", 983);
        Produto smartTv = new Importado("Smart TV 85” UHD 4K LED Crystal Samsung 85CU8000 Lançamento 2023 - Wi-Fi Bluetooth Alexa 3 HDMI", 7899);

        geladeira.relatorio();
        fogao.relatorio();
        smartTv.relatorio();
    }
}
