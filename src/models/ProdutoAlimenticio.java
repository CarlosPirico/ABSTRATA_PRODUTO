package models;

public class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    private String infoNutricionais;

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String infoNutricionais) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.infoNutricionais = infoNutricionais;
    }

    public String insert() {
        return "INSERT INTO produtos_alimenticios (nome, preco_custo, preco_venda, data_validade, info_nutricionais) " +
                "VALUES ('" + super.nome + "', " + super.precoCusto + ", " + super.precoVenda + ", '" + dataValidade + "', '" + infoNutricionais + "');";
    }

    public String delete() {
        return "DELETE FROM produtos_alimenticios WHERE nome = '" + super.nome + "';";
    }

    public String update(double novoPrecoCusto, double novoPrecoVenda, String novaDataValidade, String novasInfoNutricionais) {
        return "UPDATE produtos_alimenticios SET preco_custo = " + novoPrecoCusto + ", preco_venda = " + novoPrecoVenda +
                ", data_validade = '" + novaDataValidade + "', info_nutricionais = '" + novasInfoNutricionais + "' WHERE nome = '" + super.nome + "';";
    }
}
