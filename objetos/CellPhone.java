package talleres.objetos;
/**
 * Representa un telefono celular con atributos como marca, modelo,
 * sistema operativo y estado del bloqueo
 */
public class CellPhone {
    /**
     * Representa la marca del celular
     */
    public String brand;
    /**
     * Representa el modelo del celular
     */
    public String model;
    /**
     * Representa el sistema operativo del celular
     */
    public String operatingSystem;
    /**
     * Representa el peso del celular
     */
    public float height;
    /**
     * Representa el estado de bloqueo del celular
     */
    private boolean locked;
    /**
     * Crea una instancia de la clase CellPhone cuando no se pasan parametros
     */
    public CellPhone() {
        brand = "Sony";
        model = "V3";
        operatingSystem = "Android";
        height = 50;
    }
    /**
     * Crea una instancia de la clase CallPhone cuando se pasan parametros
     * @param brand marca del celular
     * @param model modelo del celular
     * @param operatingSystem sistema operativo del celular
     * @param height peso del celular
     */
    public CellPhone(String brand, String model, String operatingSystem, float height) {
        this.brand = brand;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.height = height;
    }

    /**
     * Modifica el valor de la variable locked
     * @param status estado de bloqueo del celular
     */
    public void setLocked( Boolean status) {
        this.locked = !status;
    }
    /**
     * Obtiene el valor de la variable locked
     * @return valor almacenado en la variable locked
     */
    public boolean getLocked() {
        return this.locked;
    }
}
