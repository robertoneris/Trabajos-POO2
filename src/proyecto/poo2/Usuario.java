
package Proyecto.poo2;

import java.util.Scanner;

public class Usuario {
    
    String rut;
    String nombre;
    String clave;
    
    public Usuario() {
   
    }
   
    Scanner sc = new Scanner(System.in);
    
    public void solicitarRegistro() {
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su rut: ");
        rut = sc.nextLine();
    }
    
}

class Profesor extends Usuario {}

class EncargadoL extends Usuario {}

class Administrador extends Usuario {
    
    private String Ramon;
    private String ramonsito01; //Clave admin       
}
