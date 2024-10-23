package poligono;

public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles() {
        super(0, 0, 0);
    }

    public TrianguloIsosceles(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
        float altura = calculaAltura(lado1, lado2, lado3);
        setBase(lado1);     // Pergunta: por que "this.base = lado1" ou "this.altura = altura" não funcionam?
        setAltura(altura);
    }

    private float calculaAltura(float lado1, float lado2, float lado3) {
        // lado2^2 = altura^2 + (lado1/2)^2
        // altura^2 = lado2^2 - (lado1/2)^2
        // altura = sqrt(lado2^2 - (lado1)^2 / 4)
        return (float) Math.sqrt(lado2 * lado2 - (lado1 * lado1) / 4);
    }

    @Override
    public float calculaArea(float lado1, float lado2, float lado3) {
        return calculaArea(lado1, calculaAltura(lado1, lado2, lado3)); // Método Estático pode ser chamado sem instanciar um objeto
    }

    @Override
    public void imprimeTipoPoligono(float lado1, float lado2, float lado3) {
        System.out.println("Triângulo Isósceles");
    }
}