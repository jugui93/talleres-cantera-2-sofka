package objetos;
/**
 * Representa una cuenta de banco con propiedades 
 * como numero de cuenta y si esta se encuentra activada. 
 * @author Juan Morales
 */
public class BankAccount {
    /**
     * Representa el numero de cuenta en numeros enteros
     */
    private int accountNumber;
    /**
     * Indica si la la cuenta esta o no activada. 
     */
    protected boolean activated;
    /**
     * Crea una instancia de la clase BankAccount cuando no se pasan parametros
     */
    public BankAccount() {
        accountNumber = 123456789;
        activated = false;        
    }
    /**
     * Crea una instancia de la clase BankAccount cuando se pasan parametros
     * @param accountNumber corresponde al numero de cuenta
     * @param activated corresponde al estado de activación de la cuenta
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }
    /**
     * Crea una instancia de la clase BankAccount cuando se pasa el numero de cuenta
     * @param accountNumber corresponde al numero de cuenta
     */
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.activated = false;
    }
    /**
     * Modifica el valor de la variable activated
     * @param actived corresponde al estado de activación de la cuenta
     */
    public void setActivated(boolean actived) {
        this.activated = actived;
    }
    /**
     * Obtiene el valor actual de la variable activated
     * @return valor almacenado en la variable activated
     */
    public boolean getActived() {
        return this.activated;
    }
}
