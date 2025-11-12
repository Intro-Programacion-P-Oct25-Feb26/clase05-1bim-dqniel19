/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;
import java.util.Locale;
import java.util.Scanner;

public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        // Se declaran las variables
        int membresia = 25;
        double porcentajeDcto = 0.5;
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int diaPago;
        double dcto = membresia * 0.5;
        double dctoAplicado = membresia - dcto;
        
        // Se piden los datos por teclado
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();
        System.out.println("Ingrese el dia de pago");
        diaPago = entrada.nextInt();
        
        if ((diaPago>10) && (parroquia.equals("El Valle") || 
                (parroquia.equals("El Sagrario")))) {
            System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\n"
                    + "Edad: %d\nParroquia: %s\n Dia de Pago: %d\n"
                    + "Descuento (aplicable):%.2f\nTotal a pagar:%.2f\n", 
                    nombre, apellido, usuario, edad, parroquia, 
                    diaPago, dcto, dctoAplicado);
        } else {System.out.printf("Nombre: %s\nApellido: %s\nUsuario: %s\n"
                    + "Edad: %d\nParroquia: %s\n Dia de Pago: %d\n"
                    + "Descuento (NO aplicable):%.2f\nTotal a pagar:%.2f\n", 
                    nombre, apellido, usuario, edad, parroquia, 
                    diaPago, dcto, membresia);        
        }
        
        
    }
    
    
}
