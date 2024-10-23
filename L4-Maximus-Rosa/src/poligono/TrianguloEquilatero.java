package poligono;

public class TrianguloEquilatero extends Triangulo {
    public TrianguloEquilatero() {
        super(0, 0, 0);
    }

    public TrianguloEquilatero(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }

    // Lembrete: houve um erro aqui: "Method does not override method from its superclass"
    @Override
    public float calculaArea(float lado1, float lado2, float lado3) {
        return (float) (lado1 * lado1 * Math.sqrt(3) / 4);
    }

    @Override
    public void imprimeTipoPoligono(float lado1, float lado2, float lado3) {
        System.out.println("Triângulo Equilátero");
    }
}
