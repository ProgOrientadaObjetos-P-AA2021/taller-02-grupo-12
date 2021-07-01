package paquete2;

import java.io.Serializable;

public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    public double porcentajeDescuento;  
    
    public void setPorcentajeDescuento(){
        porcentajeDescuento = 25;
    }       
    
    public double getPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    
    @Override
    public void setValorPasaje(){
        vaPasaje = (km * 0.15)+(preBase + (preBase * 
                (porcentajeDescuento/100)));
    }
}