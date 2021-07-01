package paquete2;

import java.io.Serializable;

public class PasajeUniversitario extends PasajeInterCantonal 
        implements Serializable{
    
    public String nombreUniversidad;  
    
    public void setPorcentajeDescuento(){
        nombreUniversidad = "UTPL";
    }       
    
    public String getPorcentajeDescuento(){
        return nombreUniversidad;
    }        
    
    @Override
    public void setValorPasaje(){
        vaPasaje = preBase/2;
    }
}