package naves_espaciales;

public class Lanzadera extends Naves{
    public int empuje;
    public int velocidadMax;
    
    
    public Lanzadera(String name, int peso, boolean destruido, boolean orbitaTierra, int empuje, int velocidadMax){
        super(name, peso, destruido, orbitaTierra);
        this.empuje = empuje;
        this.velocidadMax = velocidadMax;
    }
    

    public void acelerar (){
        this.velocidad += 100;
    }
    public void proposito() {
        System.out.println("Sirve para lanzar una carga util al espacio");
    }
}
