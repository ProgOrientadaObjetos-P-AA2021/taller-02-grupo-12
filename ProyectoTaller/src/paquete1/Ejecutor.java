package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();
        
        PasajeMenorEdad menor1 = new PasajeMenorEdad("Jandry Jaramillo",
                "1105638041","Ecuatoriano","Tonsupa",85,250);
        menor1.setPorcentajeDescuento();
        
        
        PasajeNormal normal1 = new PasajeNormal("Jandry Jaramillo",
                "1105638041","Ecuatoriano","Tonsupa",85,250);
        normal1.setPorcentajeAdicional();
        ;
        
        PasajeTerceraEdad tercera1 = new PasajeTerceraEdad("Jandry Jaramillo",
                "1105638041","Ecuatoriano","Tonsupa",85,250);     
        
        
        PasajeUniversitario uni1 = new PasajeUniversitario("Jandry Jaramillo",
                "1105638041","Ecuatoriano","Tonsupa",85,250,"UTPL");     
        
                                       
        pasajes.add(menor1);
        pasajes.add(normal1);
        pasajes.add(tercera1);
        pasajes.add(uni1);               
                                            
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial 
        (nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).setValorPasaje();
            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
        (nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
