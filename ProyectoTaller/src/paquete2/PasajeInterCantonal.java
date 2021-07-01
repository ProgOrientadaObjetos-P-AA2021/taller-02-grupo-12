/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public abstract class PasajeInterCantonal implements Serializable{
    
    protected String nombre;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected int km;
    protected  double preBase;
    protected double vaPasaje;
    
    public PasajeInterCantonal(String n,String ci,String o,String de,int k,double pre){
        nombre = n;
        cedula = ci;
        origen =  o;
        destino = de;
        km = k;
        preBase = pre;
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
    public void set(int d){
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
    public int getNKmDistancia(){
        return km;
    }
    public double getTarifaBase(){
        return preBase;
    }
    
  
    @Override
    public String toString(){
        return String.format("Pasaje.");
    }
    
    
}
