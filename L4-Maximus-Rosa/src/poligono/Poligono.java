package poligono;

public interface Poligono {
    int TAMANHO_CANVAS = 100;

    float calculaArea(float lado1, float lado2, float lado3);

    void imprimeTipoPoligono(float lado1, float lado2, float lado3);
}
