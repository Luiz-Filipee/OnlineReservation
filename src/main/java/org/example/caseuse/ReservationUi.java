package org.example.caseuse;

import org.example.controller.ReservationSystem;
import org.example.domain.Reservation;

import java.util.Scanner;

public class ReservationUi {
    private ReservationSystem reservationSystem = new ReservationSystem();

    public void start(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Make a reservation");
            System.out.println("2. View all reservations");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit");

            System.out.println("Select one option: ");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op){
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Date: ");
                    String date = scanner.nextLine();
                    System.out.println("Number of guests: ");
                    int numberOfGuests = scanner.nextInt();
                    Reservation reservation = reservationSystem.makeReservation(name, date, numberOfGuests);
                    System.out.println("Reservation made with ID " + reservation.getId());
                    break;
                case 2:
                    System.out.println("Reservations: ");
                    for (Reservation r : reservationSystem.getAll()){
                        System.out.println(r.getId() + " - " +r.getName() + " - " +r.getDate()+ " - " +r.getNumberOfGuests());
                    }
                    break;
                case 3:
                    System.out.println("Cancel reservation: ");
                    int id = scanner.nextInt();

                    if(reservationSystem.cancelReservation(id)){
                        System.out.println("Reservation canceled!");
                    }else{
                        System.out.println("Reservation not found");
                    }
                case 4:
                    return;
                default:
                    System.out.println();
            }
        }
    }
}
