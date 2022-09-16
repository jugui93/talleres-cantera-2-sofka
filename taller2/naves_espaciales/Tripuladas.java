package naves_espaciales;
public class Tripuladas extends Naves {
    public int altura;
    public Tripuladas(String name, int peso, boolean destruido, boolean orbitaTierra, int altura){
        super(name, peso, destruido, orbitaTierra);
        this.altura = altura;
    }
    public void acelerar (){
        this.velocidad += 100;
    }
    public void proposito() {
        System.out.println("Sirve para mandar seres humanos al espacio");
    }
}
