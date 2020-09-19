
package proyecto.poo2;

import java.util.Scanner;

public class Usuario {
    
    private String rut;
    private String nombre;
    private String clave;
    
    
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }


    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Usuario(String rut, String nombre, String clave) {
        this.rut = rut;
        this.nombre = nombre;
        this.clave = clave;
    }

   

   
    
}




    

