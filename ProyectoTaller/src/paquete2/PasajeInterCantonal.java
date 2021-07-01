package paquete2;

import java.io.Serializable;

public abstract class PasajeInterCantonal implements Serializable{
    
    protected String nombre;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected double km;
    protected double preBase;
    protected double vaPasaje;
    
    public PasajeInterCantonal(String n,String ci,String o,String de,double k,double pre){
        nombre = n;
        cedula = ci;
        origen =  o;
        destino = de;
        km = k;
        preBase = pre;
    }
    
    public abstract void setValorPasaje();       
    
    public double getValorPasaje(){
        return vaPasaje;
    }
    
    public void setNombrePasajero(String n){
        nombre = n;        
    }
    public void setCedula(String i){
        cedula = i;
    }
    public void setOrigen(String v){
        origen = v;
    }
    public void setDestino(String s){
        destino = s;
    }
    public void setKm(double d){
        km = d;
    }
    public void setTarifaBase(double t){
        preBase = t;
    }
    
    public String getNombrePasjero(){
        return nombre;
    }
    public String getCedula(){
        return cedula;
    }
    public String getOrigen(){
        return origen;
    }
    public String getDestino(){
        return destino;
    }
    public double getKm(){
        return km;
    }
    public double getTarifaBase(){
        return preBase;
    }
    @Override
    public String toString(){
        String cadena = String.format("\nPasaje Intercantonal.-\n"
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