package paquete2;

import java.io.Serializable;

public class PasajeUniversitario extends PasajeInterCantonal 
        implements Serializable{
    
    public String nombreUniversidad;  

    public PasajeUniversitario(String n, String ci, String o, String de, 
            double k, double pre,String x) {
        super(n, ci, o, de, k, pre);
        nombreUniversidad = x;
    }
    
    public void setNombreUniversidad(String x){
        nombreUniversidad = x;
    }       
    
    public String getNombreUniversidad(){
        return nombreUniversidad;
    }        
    
    @Override
    public void setValorPasaje(){
        vaPasaje = preBase/2;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nPasaje Universitario.-\n"
                + "Nombre Pasajero:%s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Numero de km de distancia: %.2f\n"
                + "Tarifa Base: %.2f\n"
                + "Valor Pasaje: %.2f\n"
                + "Nombre de Universidad: %s\n",
                getNombrePasjero(),getCedula(),getOrigen(),getDestino(),
                getKm(),getTarifaBase(), getValorPasaje(),getNombreUniversidad());        
        return cadena;
    }
}