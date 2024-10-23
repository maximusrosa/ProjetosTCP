package teste;

import poligono.*;

public class AplicacaoTestaPoli {
    public static void main(String[] args) {
        TrianguloEquilatero triEq = new TrianguloEquilatero();
        triEq.imprimeTipoPoligono(2.0f, 2.0f, 2.0f);
        System.out.println("Area: " + triEq.calculaArea(2.0f, 2.0f, 2.0f) + "\n");

        TrianguloIsosceles triIs = new TrianguloIsosceles();
        triIs.imprimeTipoPoligono(12.0f, 10.0f, 10.0f);
        System.out.println("Area: " + triIs.calculaArea(12.0f, 10.0f, 10.0f) + "\n");
    }
}