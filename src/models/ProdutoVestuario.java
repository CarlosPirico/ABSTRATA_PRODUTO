package models;

public class ProdutoVestuario extends Produto {
    private String tamanho;
    private String cor;
    private String material;

    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    public String insert() {
        return "INSERT INTO produtos_vestuario (nome, preco_custo, preco_venda, tamanho, cor, material) " +
                "VALUES ('" + super.nome + "', " + super.precoCusto + ", " + super.precoVenda + ", '" + tamanho + "', '" + cor + "', '" + material + "');";
    }

    public String delete() {
        return "DELETE FROM produtos_vestuario WHERE nome = '" + super.nome + "';";
    }

    public String update(double novoPrecoCusto, double novoPrecoVenda, String novoTamanho, String novaCor, String novoMaterial) {
        return "UPDATE produtos_vestuario SET preco_custo = " + novoPrecoCusto + ", preco_venda = " + novoPrecoVenda +
                ", tamanho = '" + novoTamanho + "', cor = '" + novaCor + "', material = '" + novoMaterial + "' WHERE nome = '" + super.nome + "';";
    }
}

