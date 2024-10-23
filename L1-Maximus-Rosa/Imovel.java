public class Imovel {
    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String endereco;
    boolean aluguel;
    double valorVenda;


    void imprimeDados() {
        System.out.printf("Quartos: %d\n", this.nQuartos);
        System.out.printf("Banheiros: %d\n", this.nBanheiros);
        System.out.printf("Garagem: %s\n", this.temGaragem ? "Sim" : "Não");
        System.out.printf("Endereço: %s\n", this.endereco);
        System.out.printf("Aluguel: %s\n", this.aluguel ? "Sim" : "Não");
        System.out.printf("Valor da venda: %.2f\n", this.valorVenda);

        System.out.print("\n");
    }

    void valoriza(double perc) {
        this.valorVenda += valorVenda * perc / 100;
    }


    double calculaImposto() {
        return (this.aluguel == true) ?  this.valorVenda * 0.08 :   this.valorVenda * 0.12;
        
    }

}

