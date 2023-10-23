package org.example.start;

import org.example.caseuse.ReservationUi;
import org.example.controller.ReservationSystem;
import org.example.domain.Reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationUi obj = new ReservationUi();
        obj.start();
    }
}