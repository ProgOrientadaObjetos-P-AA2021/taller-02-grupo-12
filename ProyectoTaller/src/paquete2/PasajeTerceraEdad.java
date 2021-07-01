package paquete2;

import java.io.Serializable;

public class PasajeTerceraEdad extends PasajeInterCantonal 
        implements Serializable{

    public PasajeTerceraEdad(String n, String ci, String o, String de, 
            double k, double pre) {
        super(n, ci, o, de, k, pre);
    }
    
    @Override
    public void setValorPasaje(){
        vaPasaje = (km * 0.5)+(preBase/2);
    }
      
    @Override
    public String toString(){
        String cadena = String.format("\nPasaje Tercera Edad.-\n"
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