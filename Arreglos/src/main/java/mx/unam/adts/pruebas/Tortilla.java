package mx.unam.adts.pruebas;

public class Tortilla {
    private String ingrediente;
    private float radio;
    private float grosor;

    public Tortilla() {
    }

    public Tortilla(String ingrediente, float radio, float grozor) {
        this.ingrediente = ingrediente;
        this.radio = radio;
        this.grosor = grozor;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getGrosor() {
        return grosor;
    }

    public void setGrosor(float grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Tortilla{" +
                "ingrediente='" + ingrediente + '\'' +
                ", radio=" + radio +
                ", grosor=" + grosor +
                '}';
    }
}
