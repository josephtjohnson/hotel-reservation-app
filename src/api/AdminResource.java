package api;

import model.Customer;
import model.IRoom;
import service.CustomerService;
import service.ReservationService;

import java.util.*;

public class AdminResource {
    private static AdminResource adminResource;
    public static final Collection<IRoom> rooms = new HashSet<>();
    public static final CustomerService customerService = CustomerService.getInstance();
    public static final ReservationService reservationService = ReservationService.getInstance();

    public static AdminResource getInstance() {
        if (null == adminResource){
            adminResource = new AdminResource();
        }
        return adminResource;
    }
    public Collection<IRoom> getAllRooms(){
        return reservationService.getRooms();
    }
    public Collection<Customer> getAllCustomers(){
        return customerService.getCustomers();
    }
    public void displayAllReservations(){
        reservationService.printAllReservations();
    }
    public void customerList() { customerService.customerList(); }
    public void roomList() {
        reservationService.roomList();
    }
    public void reserveARoom(Customer customer, IRoom room, Date checkIn, Date checkOut, boolean isFree) {
        reservationService.reserveARoom(customer, room, checkIn, checkOut, isFree);
    }
    public void addTestData() {
        reservationService.addTestCustomers();
        reservationService.addTestRooms();
        reservationService.addTestReservations();
    }
    public Date addDays(Date date, int number ) {
    return reservationService.addDays(date, number);
    }
}
