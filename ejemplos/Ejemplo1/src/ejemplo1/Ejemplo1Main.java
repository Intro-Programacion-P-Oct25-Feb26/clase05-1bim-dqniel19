/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author UTPL
 */
public class Ejemplo1Main {
    public static void main(String[] args) {
        // Condicionales simplesmain
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double limiteNotas = 6.9;
        
        double promedio;
        System.out.println("Ingrese un valor para analizar");
        promedio = entrada.nextDouble();
        
        
        if (promedio >= limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
        

        if (promedio == limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio < limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

}

}
