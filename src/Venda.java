import java.util.Date;

public class Venda {

    private Cliente cliente;

    private Produto produto;

    private int quantidade;

    private Date data;

    public Venda() {

    }

    public Venda(Cliente cliente, Produto produto, int quantidade, Date data) {

        this.cliente = cliente;

        this.produto = produto;

        this.quantidade = quantidade;

        this.data = data;

    }

    public Venda(Cliente cliente, Produto produto) {

        this.cliente = cliente;

        this.produto = produto;

        this.quantidade = 0;

        this.data = new Date();

    }

    public Cliente getCliente() {

        return cliente;

    }


    public void setCliente(Cliente cliente) {

        this.cliente = cliente;

    }


    public Produto getProduto() {

        return produto;

    }


    public void setProduto(Produto produto) {

        this.produto = produto;

    }


    public int getQuantidade() {

        return quantidade;

    }


    public void setQuantidade(int quantidade) {

        this.quantidade = quantidade;
    }
}