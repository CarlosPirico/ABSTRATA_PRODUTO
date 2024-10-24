package models;

public abstract class Produto {
    protected String nome;
    protected double precoCusto;
    protected double precoVenda;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String calcularLucro() {
        double lucro = precoVenda - precoCusto;
        return "O lucro do produto " + nome + " é de R$" + String.format("%.2f", lucro);
    }

    public String insert() {
        return "INSERT INTO produtos (nome, preco_custo, preco_venda) VALUES ('" + nome + "', " + precoCusto + ", " + precoVenda + ");";
    }

    public String delete() {
        return "DELETE FROM produtos WHERE nome = '" + nome + "';";
    }

    public String update(double novoPrecoCusto, double novoPrecoVenda) {
        return "UPDATE produtos SET preco_custo = " + novoPrecoCusto + ", preco_venda = " + novoPrecoVenda + " WHERE nome = '" + nome + "';";
    }
}