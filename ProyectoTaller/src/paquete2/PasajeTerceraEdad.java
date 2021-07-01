package paquete2;

import java.io.Serializable;

public class PasajeTerceraEdad extends PasajeInterCantonal 
        implements Serializable{
    
    @Override
    public void setValorPasaje(){
        vaPasaje = (km * 0.5)+(preBase/2);
    }
       
}