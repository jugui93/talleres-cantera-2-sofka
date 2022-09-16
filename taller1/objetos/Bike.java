package objetos;
/**
 * Representa una bicicleta con atributos como marca,tipo, modelo,
 * color y maxima velocidad.
 */
public class Bike {
    /**
     * Representa la marca de la bicilceta
     */
    public String brand;
    /**
     * Representa el tipo de bicilceta
     */
    public String type;
    /**
     * Representa el color de la bicilceta
     */
    public String color;
    /**
     * Representa el modelo de la bicilceta
     */
    public int model;
    /**
     * Representa la velocidad de la bicilceta
     */
    public int speed;
    /**
     * Representa la maxima velocidad alcanzada en la bicilceta
     */
    private int maxSpeed;
    /**
     * Crea una instancia de la clase Bike
     * @param brand marca de la bicicleta
     * @param type tipo de bicicleta
     * @param color color de la bicicleta
     * @param model modelo de la bicicleta
     * @param speed velocidad de la bicicleta
     * @param maxSpeed maxima velcidad alcanzada en la bicicleta
     */
    public void Bike(String brand, String type, String color, int model, int speed, int maxSpeed){
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }
    /**
     * modifica el valor de la variable velocidad maxima
     */
    public void setMaxSpeed(){
        if (speed > maxSpeed){
            this.maxSpeed = speed;
        }
    }
    /**
     * Modifica el valor de la variable velocidad. 
     */
    private void speedUp() {
        this.speed += 5;
    }
}
