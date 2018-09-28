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
public class Travel {
    private String start;
    private int duration;
    private BookedFlight outbound;
    private BookedFlight returrn;
    private Hotel hotel;

    public Travel(String start, int duration, String salida, String llegada, int flightnumber, Airport from, Airport to,Hotel hotel) {
        this.start = start;
        this.duration = duration;
        //Ejemplo de composición
        this.outbound = new BookedFlight(flightnumber,salida,llegada,from,to);
        this.returrn = new BookedFlight(flightnumber,llegada,salida,to, from);
        this.hotel = hotel;
    }
    
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public BookedFlight getOutbound() {
        return outbound;
    }

    public void setOutbound(BookedFlight outbound) {
        this.outbound = outbound;
    }

    public BookedFlight getReturrn() {
        return returrn;
    }

    public void setReturrn(BookedFlight returrn) {
        this.returrn = returrn;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
}
