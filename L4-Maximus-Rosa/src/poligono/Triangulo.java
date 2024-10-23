package poligono;

public abstract class Triangulo implements Poligono {
    private float lado1;
    private float lado2;
    private float lado3;
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método estático: Pode ser chamado sem instanciar um objeto
    public static float calculaArea(float base, float altura) {
        return (base * altura) / 2;
    }

    // Método não-estático: Precisa ser chamado a partir de um objeto
    public float calculaArea() {
        return (this.base * this.altura) / 2;
    }

    public abstract void imprimeTipoPoligono(float lado1, float lado2, float lado3);
}