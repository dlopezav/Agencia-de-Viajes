/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadevuelos;

/**
 *
 * @author Diego Lopez Avila
 * dlopezav@unal.edu.co
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TravelAgency agencia= new TravelAgency("Aviatur");
        if(agencia.addHotel("Fontanar", "Cra. 21a #159a-28")){
            System.out.println("Agencia añadida con exito");
        }
        Hotel hotel1=agencia.getKnownhotels()[0];
        if(agencia.addAirport("Jose Maria Córdoba")){
            System.out.println("Aeropuerto añadido con exito");
        }
        Airport aeropuerto1=agencia.getAirports()[0];
        if(agencia.addAirport("El Dorado")){
            System.out.println("Aeropuerto añadido con exito");
        }
        Airport aeropuerto2=agencia.getAirports()[1];
        if(agencia.addTravel("22/03/2017", 30, "22/03/2017","22/03/2017", 1345, aeropuerto1, aeropuerto2, hotel1)){
            System.out.println("Viaje añadido exitosamente");
        }
        /*Aquí para comprobar la existencia de los datos del Viaje #1
        System.out.println(agencia.getOfferedtravels()[0].getStart());
        System.out.println(agencia.getOfferedtravels()[0].getDuration()+" minutos");
        System.out.println("Hotel: "+agencia.getOfferedtravels()[0].getHotel().getAddress()+ ", en direccion: "+agencia.getOfferedtravels()[0].getHotel().getAddress());
        System.out.println("Desde: "+agencia.getOfferedtravels()[0].getOutbound().getFrom().getDescription());
        System.out.println("Hasta: "+agencia.getOfferedtravels()[0].getOutbound().getTo().getDescription());
        */
        
        //Listar Viajes
        
        System.out.println(agencia.toString());
    }
    
}
