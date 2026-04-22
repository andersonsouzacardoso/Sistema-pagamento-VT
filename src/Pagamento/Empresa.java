package Pagamento;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Colaborador> colaboradores = new ArrayList<>();
    double valor = 573.80;

    // Método para adicinar colaboradores no array
    void adicionarColaboradores(String nome){
        colaboradores.add(new Colaborador(nome));
    }
    // Método para adicionar valor a cada colaborador da lista atraves de um FOR;
    void pagamento(double valor){
        for (Colaborador c : colaboradores){
            c.receberPagamento(valor);
        }
    }
    // Método para imprimir nome e valor na lista.
    void imprimirPagamento(){
        for (Colaborador c : colaboradores){
            System.out.println(c.nome + " Recebeu: R$ " + String.format("%.2f", c.passagem));
        }
    }
}
