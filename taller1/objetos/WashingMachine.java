package objetos;
/**
 * Representa una lavadora con atributos como marca, color, estado, ciclo, capacidad. 
 *  @author Juan Morales
 */
public class WashingMachine {
    /**
     * Representa la marac de la lavadora
     */
    public String brand;
    /**
     * Representa el color de la lavadora
     */
    public String color; 
    /**
     * representa el estado de la lavadora
     */
    public boolean status;
    /**
     * Representa el ciclo actual de la lavadora
     */
    private String cycle;
    /**
     * Representa la capacidad en libras de la lavadora
     */
    public int capacity;
    /**
     * Crea una instancia de la clase WashingMachine
     * @param brand marca de la lavadora
     * @param color color de la lavadora
     * @param status estado de la lavadora
     * @param capacity capacidad del lavadora en libras
     */
    public void WashingMachine (String brand, String color, boolean status, int capacity){
        this.brand = brand;
        this.color = color;
        this.status = status;
        this.capacity = capacity;
    }
    /**
     * Obtiene el valor de la variable cycle
     * @return valor almacenado en la variable cycle
     */
    protected String getCycle() {
        return this.cycle;
    }
    /**
     * Modifica el ciclo actual de la lavadora
     * @param currentCycle ciclo en el que se encuentra la lavadora
     */
    public void setCycle (String currentCycle){
        this.cycle = currentCycle;
    }
}
