

public class ProgramaPrincipal {

    public static void main (String[] args){
        Imovel im1; // declaracao do objeto
        im1 = new Imovel(); // instanciacao do objeto
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos Fulanos, n. 0";
        im1.aluguel = true;
        im1.valorVenda = 142000;

        // im1.imprimeDados();

        im1.valoriza(3.2);

        im1.imprimeDados();

        System.out.printf("Imposto incidente sobre o imóvel: R$ %.2f\n", im1.calculaImposto());

        System.out.print("\n");


        Imovel im2; // declaracao do objeto
        im2 = new Imovel(); // instanciacao do objeto
        im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.endereco = "Rua dos Fulanos, n. 0";
        im2.aluguel = true;
        im2.valorVenda = 142000;


        if (im1 == im2){
            System.out.println("Mesmos imoveis!");
        }else{
            System.out.println("Imoveis distintos!");
        }

        /* A comparação é feita entre as referências (que contém os endereços dos dois objetos), que são distintas. */
        }

        //Imovel im3 = im1;

        /* A atribuição não funciona, pois tenta atribuir um objeto a uma referência */

        //im3.imprimeDados();
        //im1.imprimeDados();
    
}
