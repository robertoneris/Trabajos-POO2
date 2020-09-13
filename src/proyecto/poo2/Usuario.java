
package proyecto.poo2;

import java.util.Scanner;

public class Usuario {
    String rut;
    String nombre;
    public String clave;

    public Usuario(String rut, String nombre, String clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.clave = clave;
    }

   
    
    Scanner sc = new Scanner(System.in);
    
    public void solicitarRegistro() {
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su rut: ");
        rut = sc.nextLine();
    }
    
}




    

