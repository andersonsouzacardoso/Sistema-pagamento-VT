package Pagamento;

public class Colaborador {
    String nome;
    double passagem;
//construtor obrigatorio
    Colaborador(String nome){
        this.nome = nome;
        this.passagem = 0;

    }
    // passagem vai receber valor
    void receberPagamento(double valor){
        this.passagem = valor;
    }
}
