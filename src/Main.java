import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();
        novoPedido.numeroPedido = 1;
        novoPedido.codigoCliente = 2;
        novoPedido.valor = 3;

        novoPedido.itensPedido = new ArrayList();

        ItemPedido item = new ItemPedido();
        item.sequenciaIteem = 1;
        item.quantidade = 3;
        item.quantidade = 20;
        item.valor = 49;

        ItemPedido novoitem = new ItemPedido();
        novoitem.sequenciaIteem = 1;
        novoitem.codigoIteem = 2;
        novoitem.quantidade = 50;
        novoitem.quantidade = 5;

        //Vincula o item criado com o item pedido
        novoPedido.itensPedido.add(item);
    }
}