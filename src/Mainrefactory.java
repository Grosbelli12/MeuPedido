public class Mainrefactory {

    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();
        novoPedido.criarPedido();

        System.out.println(novoPedido.valor);
         novoPedido.adicionarItem(1, 10, 2);


        System.out.println("total pedido : " + novoPedido.valor);


    }
}