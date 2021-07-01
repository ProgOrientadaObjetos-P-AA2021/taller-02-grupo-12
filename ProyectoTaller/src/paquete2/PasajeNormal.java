package paquete2;

import java.io.Serializable;

public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    
    public double porcentajeAdicional;
    
    public void setPorcentajeAdicional(){
        porcentajeAdicional = 25;
    }       
    
    public double getPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    @Override
    public void setValorPasaje(){
        vaPasaje = (km * 0.10)+(preBase - (preBase * 
                (porcentajeAdicional/100)));
    }
}