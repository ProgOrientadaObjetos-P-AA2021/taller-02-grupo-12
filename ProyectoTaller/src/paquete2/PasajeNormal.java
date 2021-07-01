package paquete2;

import java.io.Serializable;

public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    
    public double porcentajeAdicional;

    public PasajeNormal(String n, String ci, String o, String de, 
            double k, double pre) {
        super(n, ci, o, de, k, pre);
    }
    
    public void setPorcentajeAdicional(){
        porcentajeAdicional = 25;
    }       
    
    public double getPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    @Override
    public void setValorPasaje(){
        vaPasaje = (km * 0.10)+(preBase + (preBase * 
                (porcentajeAdicional/100)));
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nPasaje Intenacional.-\n"
                + "Nombre Pasajero:%s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Numero de km de distancia: %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Valor Pasaje: %.2f\n",
                getNombrePasjero(),getCedula(),getOrigen(),getDestino(),
                getKm(),getTarifaBase(), getValorPasaje());        
        return cadena;
    }
}