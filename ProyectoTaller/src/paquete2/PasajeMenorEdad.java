package paquete2;

import java.io.Serializable;

public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    public double porcentajeDescuento;  

    public PasajeMenorEdad(String n, String ci, String o, String de, 
            double k, double pre) {
        super(n, ci, o, de, k, pre);
    }
    
    public void setPorcentajeDescuento(){
        porcentajeDescuento = 25;
    }       
    
    public double getPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    
    @Override
    public void setValorPasaje(){
        vaPasaje = (km * 0.15)+(preBase - (preBase * 
                (porcentajeDescuento/100)));
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