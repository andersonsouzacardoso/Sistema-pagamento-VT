package Pagamento;

public class Pagamento {
    public static void main(String[] args) {
        Empresa pagou = new Empresa();
        pagou.adicionarColaboradores("Anderson");
        pagou.adicionarColaboradores("Bianca");
        pagou.adicionarColaboradores("Carol");
        pagou.adicionarColaboradores("Denise");
        pagou.adicionarColaboradores("Elen");
        pagou.adicionarColaboradores("Fernando");
// objeto + classe + objeto + valor
// objeto + classe que imprime nomr e pagamento.
        pagou.pagamento(pagou.valor);
        pagou.imprimirPagamento();
    }
}
