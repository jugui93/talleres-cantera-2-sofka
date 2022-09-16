package naves_espaciales;

public class NoTripuladas extends Naves{
    public int empuje;
    public NoTripuladas(String name, int peso, boolean destruido, boolean orbitaTierra, int empuje){
        super(name, peso, destruido, orbitaTierra);
        this.empuje = empuje;
    }
    public void acelerar (){
        this.velocidad += 200;
    }
    public void proposito() {
        System.out.println("Sirve para estudiar cuerpos celestes");
    }
}
