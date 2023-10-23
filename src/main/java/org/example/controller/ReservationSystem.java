package org.example.controller;

import org.example.domain.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {

    private List<Reservation> reservationList = new ArrayList<>();
    private int nextId = 1;

    public Reservation makeReservation(String name, String date, int numberOfGuests){
        Reservation reservation = new Reservation(nextId++, name, date, numberOfGuests);
        reservationList.add(reservation);
        return reservation;
    }

    public List<Reservation> getAll(){
        return reservationList;
    }

    public Reservation getReservationById(int id){
        for (Reservation reservation : reservationList){
            if (reservation.getId() == id){
                return reservation;
            }
        }
        return null;
    }

    public boolean cancelReservation(int id){
        Reservation reservation = getReservationById(id);
        if(reservation != null){
            reservationList.remove(reservation);
            return true;
        }
        return false;
    }


}
