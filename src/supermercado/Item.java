package supermercado;

public class Item {
    private String nome;
    private int codigo;
    private int quantidadeComprada;
    private double custoUnitario;

    public Item(String nome, int codigo, int quantidadeComprada, double custoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeComprada = quantidadeComprada;
        this.custoUnitario = custoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }
}
