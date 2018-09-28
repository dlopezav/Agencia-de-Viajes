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
public class TravelAgency {
    private String name;
    private Airport[] airports;
    private Hotel[] knownhotels;
    private Travel[] offeredtravels;

    public TravelAgency(String name) {
        this.name = name;
        this.airports = new Airport[4];
        this.knownhotels = new Hotel[5];
        this.offeredtravels = new Travel[10];
    }
    //Metodos de Composición
    public boolean addHotel(String address, String name){
        for(int i=0;i<5;i++){
        if(knownhotels[i]==null){
            knownhotels[i]=new Hotel(name,address);
            return true;
        }
        }
        return false;
    }
    public boolean addAirport(String description){
        for(int i=0;i<4;i++){
        if(airports[i]==null){
            airports[i]=new Airport(description);
            return true;
        }
        }
        return false;
    }
    public boolean addTravel(String start,int duration,String salida,String llegada, int flightnumber, Airport from, Airport to,Hotel hotel){
        for(int i=0;i<10;i++){
        if(offeredtravels[i]==null){
            offeredtravels[i]=new Travel(start,duration,salida,llegada,flightnumber,from,to,hotel);
            return true;
        }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Airport[] getAirports() {
        return airports;
    }

    public Hotel[] getKnownhotels() {
        return knownhotels;
    }

    public Travel[] getOfferedtravels() {
        return offeredtravels;
    }

 
    
}
