/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo2;

import java.io.Serializable;

/**
 *
 * @author x_jor
 */
public class Equipos extends Sede implements Serializable {
    
    private String N_serie;
    private String Nombre;
    private String Marca;
    private String AñoFabricacion;
    private String Laboratorio;
    private String Sede;
    private boolean EstadoOperatividad; 
    
    //contructor de la clase

    public Equipos(String N_serie, String Nombre, String Marca, String AñoFabricacion, String Laboratorio, String Sede, boolean EstadoOperatividad) {
        this.N_serie = N_serie;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.AñoFabricacion = AñoFabricacion;
        this.Laboratorio = Laboratorio;
        this.Sede = Sede;
        this.EstadoOperatividad = EstadoOperatividad;
    }

    public String getN_serie() {
        return N_serie;
    }

    public void setN_serie(String N_serie) {
        this.N_serie = N_serie;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre =Nombre;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getAñoFabricacion() {
        return AñoFabricacion;
    }

    public void setAñoFabricacion(String AñoFabricacion) {
        this.AñoFabricacion = AñoFabricacion;
    }

    public String getLaboratorio() {
        return Laboratorio;
    }

    public void setLaboratorio(String Laboratorio) {
        this.Laboratorio = Laboratorio;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
    }

    public boolean getEstadoOperatividad() {
        return EstadoOperatividad;
    }

    public void setEstadoOperatividad(boolean EstadoOperatividad) {
        this.EstadoOperatividad = EstadoOperatividad;
    }

  

    
    
}
