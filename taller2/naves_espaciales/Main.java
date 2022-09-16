package naves_espaciales;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean crearNave;
        do {
            System.out.println("Escriba el numero del tipo de nave que desea crear");
            System.out.println("1. Lanzadera \n2. No tripulada \n3.Tripulada");
            String tipoNave = input.nextLine();

            switch(tipoNave) {
                case "1":             
                    System.out.println("Escriba el nombre de la nueva nave");
                    String name1 = input.nextLine();
                    System.out.println("Escriba el peso de la nave");
                    int peso1 = input.nextInt();
                    System.out.println("La nave fue destruida true/false");
                    Boolean destruido1 = input.nextBoolean();
                    System.out.println("La nave orbita alrededor de la tierra si/no");
                    Boolean orbitaTierra1 = input.nextBoolean();
                    System.out.println("Escriba el empuje de la nueva nave");
                    int empuje1 = input.nextInt();
                    System.out.println("Escriba la velocidad maxima de la nueva nave");
                    int velocidadMax1 = input.nextInt();
                    
                    Naves L1 = new Lanzadera(name1, peso1, destruido1, orbitaTierra1, empuje1, velocidadMax1 );
                    break;
                case "2":             
                    System.out.println("Escriba el nombre de la nueva nave");
                    String name2 = input.nextLine();
                    System.out.println("Escriba el peso de la nave");
                    int peso2 = input.nextInt();
                    System.out.println("La nave fue destruida true/false");
                    Boolean destruido2 = input.nextBoolean();
                    System.out.println("La nave orbita alrededor de la tierra true/false:");
                    Boolean orbitaTierra2 = input.nextBoolean();
                    System.out.println("Escriba el empuje de la nueva nave");
                    int empuje2 = input.nextInt();
                                        
                    Naves L2 = new NoTripuladas(name2, peso2, destruido2, orbitaTierra2, empuje2);
                    break;
                case "3":             
                    System.out.println("Escriba el nombre de la nueva nave");
                    String name3 = input.nextLine();
                    System.out.println("Escriba el peso de la nave");
                    int peso3 = input.nextInt();
                    System.out.println("La nave fue destruida true/false");
                    Boolean destruido3 = input.nextBoolean();
                    System.out.println("La nave orbita alrededor de la tierra true/false:");
                    Boolean orbitaTierra3 = input.nextBoolean();
                    System.out.println("Escriba la altura de la orbita:");
                    int altura3 = input.nextInt();
                                        
                    Naves L3 = new Tripuladas(name3, peso3, destruido3, orbitaTierra3, altura3);
                    break;
                default:
                    System.out.println("Ingresa un valor valido");
            }
            System.out.println("Desea agregar otra Nave true/false:");
            crearNave = input.nextBoolean();
        }
        while(crearNave == true);
    }
}
