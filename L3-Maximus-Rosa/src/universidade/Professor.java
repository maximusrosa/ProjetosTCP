package universidade;

public class Professor {
    private int id;
    private String departamento;

    // Constutor padrão
    public Professor() {
        System.out.println("Professor criado sem informações.");
    }

    // Construtor com parâmetros
    public Professor(int id, String departamento) {
        this.id = id;
        this.departamento = departamento;
        System.out.println("Professor criado com ID: " + id);
    }

    // Getter e Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

