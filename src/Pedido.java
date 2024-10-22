import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numeroPedido;

    public int codigoCliente;

    public double valor;

    //cria uma lista do Item pedido

    public List<ItemPedido> itensPedido;

    public void criarPedido() {
        this.numeroPedido = 1;
        this.valor = 50;
        this.itensPedido = new ArrayList<>();

    }
    public void adicionarItem(int codigo, int quantidade, double valor) {
        ItemPedido item = new ItemPedido();
        item.sequenciaIteem = this.itensPedido.size();
        item.codigoIteem = codigo;
        item.quantidade = quantidade;
        item.valor = valor;

        this.valor += item.quantidade * item.valor;

        this.itensPedido.add(item);

    }
}
