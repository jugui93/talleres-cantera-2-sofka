package naves_espaciales;
public abstract class Naves {
    public String name;
    public int peso;
    public boolean orbitaTierra;
    public boolean destruido;
    private String combustible;
    public int velocidad;

    public Naves(String name, int peso, boolean orbitaTierra, boolean destruido) {
        this.name = name;
        this.peso = peso;
        this.destruido =  destruido;
        this.combustible = "liquido";
        this.velocidad = 0;
    }
    public void setCombustible(String combustible) {
        this.combustible= combustible;
    }

    public String getCombustible(){
        return this.combustible;
    }

    public abstract void acelerar();

    public abstract void proposito();
}
