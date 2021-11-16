package api;

import model.Customer;
import model.IRoom;
import service.CustomerService;
import service.ReservationService;

import java.util.*;

import static service.CustomerService.getCustomers;
import static service.ReservationService.getRooms;
import static service.ReservationService.printAllReservations;

public class AdminResource {
    private static final AdminResource adminResource = null;
    public static final Collection<IRoom> rooms = new HashSet<>();
    public static final CustomerService customerService = CustomerService.getInstance();
    public static final ReservationService reservationService = ReservationService.getInstance();

    public static AdminResource getInstance() {
        if(null == adminResource){
            AdminResource adminResource = new AdminResource();
        }
        return adminResource;
    }
    public static Collection<IRoom> getAllRooms(){
        return getRooms();
    }
    public static Collection<Customer> getAllCustomers(){
        return getCustomers();
    }
    public static void displayAllReservations(){
        printAllReservations();
    }
    public static void customerList() {
        CustomerService.customerList();
    }
    public static void roomList() {
        ReservationService.roomList();
    }
    public static void addRooms() {
        ReservationService.addRooms();
    }
    public static void addTestData() {
        ReservationService.addTestCustomers();
        ReservationService.addTestRooms();
        ReservationService.addTestReservations();
    }
}
