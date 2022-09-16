package talleres.objetos;

import java.sql.Date;
/**
 * Representa una persona con atributos como nombre, apellido 1 y apellido 2,
 * fecha de nacimiento y peso. 
 *  @author Juan Morales
 */
public class Person {
    /**
     * Representa el nombre de la persona
     */
    public String name;
    /**
     * Representa el primer apellido de la persona
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de la persona
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * Representa el peso de la persona
     */
    public float height;

    /**
     * Crea una instancia de la clase Person cuando no se pasan parametros
     */
    public Person() {
        name = "";
        lastName1 = "";
        lastName2 = "";
        height = 50;
    }
    /**
     * Crea una instancia de la clase Person cuando se pasan parametros
     * @param name nombre de la persona
     * @param lastName1 primer apellido de la persona
     * @param lastName2 segundo apellido de la persona
     * @param heigth peso de la persona
     */
    public Person(String name, String lastName1, String lastName2, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.height = height;
    }

    /**
     * Modifica el valor de la variable name
     * @param name nuevo nombre a asiganar a la variable
     */
    public void setName( String name) {
        this.name = name;
    }
    /**
     * Obtiene el valor de la variable name
     * @return valro almacenado en la variable name
     */
    public String getName() {
        return name;
    }
}
