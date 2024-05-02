package br.com.Exercicio02.TaxacaoImposto;
import java.util.ArrayList;

class CadastrarProduto {


    ArrayList<Estadual> ProdutoEstadual = new ArrayList<>();
    ArrayList<Nacional> ProdutosNacionais = new ArrayList<>();
    ArrayList<Importado> ProdutosImportados = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();



    public void cadastrarEstadual ( Estadual ProdutoEstadual){

        this.ProdutoEstadual.add(ProdutoEstadual);
        this.produtos.add(ProdutoEstadual);
    }

    public void cadastrarNacional(Nacional ProdutoNacinal){
        this.ProdutosNacionais.add(ProdutoNacinal);
        this.produtos.add(ProdutoNacinal);
    }

    public void cadastrarImportado(Importado produtosImportados){

        this.ProdutosImportados.add(produtosImportados);
        this.produtos.add(produtosImportados);
    }


    public void listaDeProdutosEstaduais(){

        for(int i = 0; i < ProdutoEstadual.size(); i++){
            System.out.println((i+1)+"."+ ProdutoEstadual.get(i).getDescricao());
        }
    }

    public void listaDeProdutosImportados(){
        for(int i = 0; i < ProdutosImportados.size(); i++){
            System.out.println((i+ 1)+". " + ProdutosImportados.get(i).getDescricao());
        }
    }

    public void listadeProdutosNacionais(){
        for(int i = 0; i < ProdutosNacionais.size();i++){
            System.out.println((i+1)+". "+ ProdutosNacionais.get(i).getDescricao());
        }
    }

    public void listarTodosProdutos(){
        for (int i = 0; i < produtos.size(); i++){
            System.out.println((1+ i)+". "+ produtos.get(i).getDescricao());
        }
    }




}



public class Testes {
    public static void main(String[] args) {
        Estadual geladeira = new Estadual("Geladeira/Refrigerador Electrolux Multidoor - 590L Efficient IM8S",6509);
        Nacional fogao = new Nacional("Fogão 5 Bocas A Gás Itatiaia Electra Glass Mesa De Vidro E Acendimento Automático Preto Bivolt", 983);
        Importado smartTv = new Importado("Smart TV 85” UHD 4K LED Crystal Samsung 85CU8000 Lançamento 2023 - Wi-Fi Bluetooth Alexa 3 HDMI", 7899);
        Estadual airFryer = new Estadual("Fritadeira Elétrica sem Óleo/Air Fryer Nell Smart - Preta 2,4L com Timer", 199);

        CadastrarProduto cadastrarProduto = new CadastrarProduto();

        cadastrarProduto.cadastrarEstadual(geladeira);
        cadastrarProduto.cadastrarEstadual(airFryer);

        cadastrarProduto.cadastrarNacional(fogao);
        cadastrarProduto.cadastrarImportado(smartTv);

//        cadastrarProduto.listaDeProdutosEstaduais();
//        cadastrarProduto.listadeProdutosNacionais();
//        cadastrarProduto.listaDeProdutosImportados();

        cadastrarProduto.listarTodosProdutos();



//
    }
}
