package supermercado;

public class Fatura {
    private Fatura fatura;
    private Cliente cliente;
    private double valorTotal;

    public Fatura(Fatura fatura, Cliente cliente, double valorTotal) {
        this.fatura = fatura;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
