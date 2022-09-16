package objetos;

import java.util.ArrayList;
/**
 * Representa una fruta con atributos como nombre, peso y color. 
 * @author Juan Morales
 */
public class Fruit {
    /**
     * Representa el nombre de la fruta
     */
    public String name;
    /**
     * Representa el peso promedio de la fruta
     */
    private float averageWeight;
    /**
     * Representa los colores de la fruta
     */
    public ArrayList<String> colors;
    /**
     * Crea una instancia de la clase Fruit cuando no se pasan parametros
     */
    public Fruit() {
        name = "Pineapple";
        averageWeight = 8.80f;
        colors = new ArrayList<String>();
        colors.add("verde");
        colors.add("amarillo");
        colors.add("cafe");
    }
    /**
     * Crea una instancia de la clase Fruit cuando se pasan parametros
     * @param name nombre de la fruta
     * @param averageWeight corresponde al peso promedio de la fruta
     * @param colors lista de colores de la fruta
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    /**
     * Modifica la lista de colores colors
     * @param name nuevo nombre a asiganar a la lista
     */
    public void setColor( String name) {
    }
    /**
     * Obtiene la de colores en colors
     * @return valores almacenados en la lista colors
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }
}
